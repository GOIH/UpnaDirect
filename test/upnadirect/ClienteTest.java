package upnadirect;
import upnadirect.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    

    @Test
    public void cliente_año_de_nacimiento_menor_1900_false() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 1890;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    
    @Test
    public void cliente_año_de_nacimiento_entre_1900_y_año_actual_True() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2005;
        boolean esEdadValida = cliente.esEdadValida();
        assertTrue(esEdadValida);
    }
    
    @Test
    public void cliente_año_de_nacimiento_mayor_año_actual_false() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2078;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    @Test
    public void cliente_año_de_nacimiento_0_false() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 0;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    @Test
    public void cliente_año_de_nacimiento_negativo_false() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = -3;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    @Test
    public void cliente_salario_positivo_true() {
        Cliente cliente = new Cliente();
        cliente.salarioAnual = 35000;
        boolean esSalarioValido = cliente.esSalarioValido();
        assertTrue(esSalarioValido);
    }
    @Test
    public void cliente_salario_negativo_false() {
        Cliente cliente = new Cliente();
        cliente.salarioAnual = -245;
        boolean esSalarioValido = cliente.esSalarioValido();
        assertFalse(esSalarioValido);
    }
    @Test
    public void cliente_salario_cero_false() {
        Cliente cliente = new Cliente();
        cliente.salarioAnual = 0;
        boolean esSalarioValido = cliente.esSalarioValido();
        assertTrue(esSalarioValido);
    }
    @Test
    public void calcular_edad_de_cliente_nacido_2006_tiene_18_años() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2006;
        boolean calcularEdad = (cliente.calcularEdad() == 18);
        assertTrue(calcularEdad);
    }
    @Test
    public void calcular_edad_de_cliente_nacido_2024_tiene_0_años() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2024;
        boolean calcularEdad = (cliente.calcularEdad() == 0);
        assertTrue(calcularEdad);
    }
    
}
