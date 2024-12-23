package upnadirect;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    

    @Test
    public void clienteAnoDeNacimientoMenor1900False() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 1890;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    
    @Test
    public void clienteAnoDeNacimientoEntre1900YAnoActualTrue() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2005;
        boolean esEdadValida = cliente.esEdadValida();
        assertTrue(esEdadValida);
    }
    
    @Test
    public void clienteAnoDeNacimientoMayorAnoActualFalse() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2078;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    @Test
    public void clienteAnoDeNacimiento0False() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 0;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    @Test
    public void clienteAnoDeNacimientoNegativoFalse() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = -3;
        boolean esEdadValida = cliente.esEdadValida();
        assertFalse(esEdadValida);
    }
    @Test
    public void clienteSalarioPositivoTrue() {
        Cliente cliente = new Cliente();
        cliente.salarioAnual = 35000;
        boolean esSalarioValido = cliente.esSalarioValido();
        assertTrue(esSalarioValido);
    }
    @Test
    public void clienteSalarioNegativoFalse() {
        Cliente cliente = new Cliente();
        cliente.salarioAnual = -245;
        boolean esSalarioValido = cliente.esSalarioValido();
        assertFalse(esSalarioValido);
    }
    @Test
    public void clienteSalarioCeroFalse() {
        Cliente cliente = new Cliente();
        cliente.salarioAnual = 0;
        boolean esSalarioValido = cliente.esSalarioValido();
        assertTrue(esSalarioValido);
    }
    @Test
    public void calcularEdadDeClienteNacido2006Tiene18Anios() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2006;
        boolean calcularEdad = cliente.calcularEdad() == 18;
        assertTrue(calcularEdad);
    }
    @Test
    public void calcularEdadDeClienteNacido2024Tiene0Anios() {
        Cliente cliente = new Cliente();
        cliente.añoNacimiento = 2024;
        boolean calcularEdad = cliente.calcularEdad() == 0;
        assertTrue(calcularEdad);
    }
    
}
