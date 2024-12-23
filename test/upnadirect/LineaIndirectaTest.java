package upnadirect;
import org.junit.Test;
import static org.junit.Assert.*;

public class LineaIndirectaTest {
    
    @Test
    public void calcular_seguro_vivienda_de_valor_120000_ano_1970_salario_35000_linea_indirecta_igual_a_4800() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.añoNacimiento = 1970;
        cliente.salarioAnual = 35000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = (lineaIndirecta.calcularImporte() == 4800);
        assertTrue(seguro);
    }
    @Test
    public void calcular_seguro_coche_de_valor_30000_ano_2005_salario_15000_linea_indirecta_igual_a_900() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vehículo";
        bien.valor = 30000;
        cliente.añoNacimiento = 2005;
        cliente.salarioAnual = 150000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = (lineaIndirecta.calcularImporte() == 900);
        assertTrue(seguro);
    }
    
    @Test
    public void calcular_importe_vivienda_de_valor_120000_ano_1970_salario_35000_linea_indirecta_igual_a_192() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vivienda";
        bien.valor = 120000;
        cliente.añoNacimiento = 1970;
        cliente.salarioAnual = 35000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = (lineaIndirecta.calcularComision() == 192);
        assertTrue(seguro);
    }
    @Test
    public void calcular_comision_coche_de_valor_30000_ano_2005_salario_15000_linea_indirecta_igual_a_9() {
        Bien bien = new Bien();
        Cliente cliente = new Cliente();
        bien.tipo = "vehículo";
        bien.valor = 30000;
        cliente.añoNacimiento = 2005;
        cliente.salarioAnual = 150000;
        LineaIndirecta lineaIndirecta = new LineaIndirecta(cliente, bien);
        boolean seguro = (lineaIndirecta.calcularComision() == 9);
        assertTrue(seguro);
    }
    
}
