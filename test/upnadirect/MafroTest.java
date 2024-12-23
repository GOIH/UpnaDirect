package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

public class MafroTest {
    
    @Test
    public void calcularSeguroViviendaValor120000Ano1970Salario35000() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.anioNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Mafro mafro = new Mafro(cliente, bien);
        boolean seguro = mafro.calcularImporte() == 3600;
        assertTrue(seguro);
    }
    @Test
    public void calcularComisionViviendaValor120000Ano1970Salario35000() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.anioNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Mafro mafro = new Mafro(cliente, bien);
        boolean seguro = mafro.calcularComision() == 108;
        assertTrue(seguro);
    }
    
}
