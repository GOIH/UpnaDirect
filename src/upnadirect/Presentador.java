package upnadirect;

import java.util.Scanner;
public class Presentador {
    private IVistaAseguradora vista;
   
    
    public Presentador(IVistaAseguradora vista){
        this.vista = vista;
    }
    
    public Cliente solicitarCliente(){
        Cliente cliente = new Cliente();
        int ano = vista.solicitarAnoNacimiento();
        cliente.añoNacimiento = ano;
        double salarioAnual = vista.solicitarSalario();
        cliente.salarioAnual = salarioAnual;
        while(!cliente.esEdadValida() || !cliente.esSalarioValido()){
            vista.errorCliente();
            ano = vista.solicitarAnoNacimiento();
            cliente.añoNacimiento = ano;
            salarioAnual = vista.solicitarSalario();
            cliente.salarioAnual= salarioAnual;
        }
        return cliente;
    }
    
    public Bien solicitarBien(){
        Bien bien = new Bien();
        String tipo = vista.solicitarTipoBien();
        bien.tipo = tipo;
        double valor = vista.solicitarValorBien();
        bien.valor = valor;
        while(!bien.esCorrectoBien()){
            vista.errorBien();
            tipo = vista.solicitarTipoBien();
            bien.tipo = tipo;
            valor = vista.solicitarValorBien();
            bien.valor = valor;
        }
        return bien;
    }
    public void ofrecerOfertaMasVentajosa(Cliente cliente, Bien bien) {
        Aseguradora mafro = new Mafro(cliente, bien);
        Aseguradora lineaIndirecta = new LineaIndirecta(cliente, bien);
        Aseguradora adasles = new Adasles(cliente, bien);
           
        mafro.calcularImporte();
        mafro.calcularComision();

        lineaIndirecta.calcularImporte();
        lineaIndirecta.calcularComision();

        adasles.calcularImporte();
        adasles.calcularComision();
        
        if (lineaIndirecta.importe < mafro.importe && lineaIndirecta.importe < adasles.importe) {
            vista.mostrarOfertaEnConsola(mafro, lineaIndirecta, adasles, lineaIndirecta);
        } else if (adasles.importe < mafro.importe && adasles.importe < lineaIndirecta.importe) {
            vista.mostrarOfertaEnConsola(mafro, lineaIndirecta, adasles, adasles);
        } else if (lineaIndirecta.importe == mafro.importe && lineaIndirecta.importe == adasles.importe) {
            // En caso de empate por importe, comparar por comisión
            if (lineaIndirecta.comision < mafro.comision && lineaIndirecta.comision < adasles.comision) {
                vista.mostrarOfertaEnConsola(mafro, lineaIndirecta, adasles, lineaIndirecta);
            } else if (adasles.comision < mafro.comision && adasles.comision < lineaIndirecta.comision) {
                vista.mostrarOfertaEnConsola(mafro, lineaIndirecta, adasles, adasles);
            }
        else
            vista.mostrarOfertaEnConsola(mafro, lineaIndirecta, adasles, mafro);
        }

    }


}