package upnadirect;
import org.junit.Test;
import static org.junit.Assert.*;

public class LineaIndirectaTest {
    
    @Test
    public void calcularSeguroViviendaValor120000Ano1970Salario35000LineaIndirectaIgual4800() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.anioNacimiento = 1970;
        cliente.salarioAnual = 35000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = lineaIndirecta.calcularImporte() == 4800;
        assertTrue(seguro);
    }
    @Test
    public void calcularSeguroCocheValor30000Ano2005Salario15000LineaIndirectaIgual900() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vehículo";
        bien.valor = 30000;
        cliente.anioNacimiento = 2005;
        cliente.salarioAnual = 150000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = lineaIndirecta.calcularImporte() == 900;
        assertTrue(seguro);
    }
    
    @Test
    public void calcularImporteViviendaValor120000Ano1970Salario35000LineaIndirectaIgual192() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.anioNacimiento = 1970;
        cliente.salarioAnual = 35000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = lineaIndirecta.calcularComision() == 192;
        assertTrue(seguro);
    }
    @Test
    public void calcularComisionCocheValor30000Ano2005Salario15000LineaIndirectaIgual9() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vehículo";
        bien.valor = 30000;
        cliente.anioNacimiento = 2005;
        cliente.salarioAnual = 150000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = lineaIndirecta.calcularComision() == 9;
        assertTrue(seguro);
    }
    
}
