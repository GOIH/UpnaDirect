package upnadirect;

import java.beans.*;
import java.io.Serializable;
class Aseguradora {
    public double importe;
    public double comision;
    public String nombre;
    Cliente cliente = new Cliente(0, 0);
    Bien bien = new Bien("", 0);
    
    public Aseguradora(Cliente cliente, Bien bien){
        this.importe = 0;
        this.comision = 0;
        this.nombre = null;
        this.bien = bien;
        this.cliente = cliente;
    }
    public Aseguradora(){
        this.importe = 0;
        this.comision = 0;
        this.nombre = null;
        this.bien = null;
        this.cliente = null;
    }
    public double calcularImporte() {
        return 0.0;
    }

    public double calcularComision() {
        return 0.0; 
    }
}
