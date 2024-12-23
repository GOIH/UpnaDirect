package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

public class BienTest {

    @Test
    public void viviendaDeMasDe50000EurosTrue() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 60000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void viviendaDeMenosDe50000EurosFalse() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 30000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void viviendaDeValorNegativoFalse() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = -5;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void viviendaDeValorMuyAltoTrue() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 50000000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void viviendaDeValorCeroFalse() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 0;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void viviendaDeValorJusto50000False() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 50000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void cocheDeMasDe50000EurosFalse() {
        Bien bien = new Bien();
        bien.tipo = "vehiculo";
        bien.valor = 60000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void cocheDeMenosDe50000EurosTrue(){
        Bien bien = new Bien();
        bien.tipo = "vehiculo";
        bien.valor = 30000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void cocheDeValorNegativoFalse(){
        Bien bien = new Bien();
        bien.tipo = "vehiculo";
        bien.valor = -10;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void cocheDeValor0True(){
        Bien bien = new Bien();
        bien.tipo = "vehiculo";
        bien.valor = 0;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void cocheDeValorJusto50000True(){
        Bien bien = new Bien();
        bien.tipo = "vehiculo";
        bien.valor = 50000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void tipoBienNoValidoFalse() {
        Bien bien = new Bien();
        bien.tipo = "novalido";
        bien.valor = 60000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
}
