package upnadirect;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdaslesTest {
    @Test
    public void calcular_seguro_vivienda_de_valor_120000_ano_1970_salario_35000_adasles_igual_a_2400() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.añoNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Aseguradora adasles = new Adasles(cliente, bien);
        boolean seguro = (adasles.calcularImporte() == 2400);
        assertTrue(seguro);
    }
   @Test
    public void calcular_importe_vivienda_de_valor_120000_ano_1970_salario_35000_adasles_igual_a_120() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.añoNacimiento = 1970;
        cliente.salarioAnual = 35000;
        Aseguradora adasles = new Adasles(cliente, bien);
        boolean seguro = (adasles.calcularComision() == 120);
        assertTrue(seguro);
    }
    
}
