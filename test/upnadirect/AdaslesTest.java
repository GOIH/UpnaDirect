package upnadirect;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdaslesTest {
    @Test
    public void calcularSeguroViviendaValor120000Ano1970Salario35000AdaslesIgual2400() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.anioNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Aseguradora adasles = new Adasles(cliente, bien);
        boolean seguro = adasles.calcularImporte() == 2400;
        assertTrue(seguro);
    }
   @Test
    public void calcularImporteViviendaValor120000Ano1970Salario35000AdaslesIgual120() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.anioNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Aseguradora adasles = new Adasles(cliente, bien);
        boolean seguro = adasles.calcularComision() == 120;
        assertTrue(seguro);
    }
    
}
