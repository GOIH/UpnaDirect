package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

public class MafroTest {
    
    @Test
    public void calcular_seguro_vivienda_de_valor_120000_ano_1970_salario_35000_mafro_igual_a_3600() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.añoNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Mafro mafro = new Mafro(cliente, bien);
        boolean seguro = (mafro.calcularImporte() == 3600);
        assertTrue(seguro);
    }
    @Test
    public void calcular_comision_vivienda_de_valor_120000_ano_1970_salario_35000_mafro_igual_a_108() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.añoNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Mafro mafro = new Mafro(cliente, bien);
        boolean seguro = (mafro.calcularComision() == 108);
        assertTrue(seguro);
    }
    
}
