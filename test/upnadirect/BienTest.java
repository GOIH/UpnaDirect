package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;
import upnadirect.Bien;

public class BienTest {

    @Test
    public void vivienda_de_mas_de_50000_euros_true() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 60000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void vivienda_de_menos_de_50000_euros_false() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 30000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void vivienda_de_valor_negativo_false() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = -5;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void vivienda_de_valor_muy_alto_true() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 50000000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void vivienda_de_valor_cero_false() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 0;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void vivienda_de_valor_justo_50000_false() {
        Bien bien = new Bien();
        bien.tipo = "vivienda";
        bien.valor = 50000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void coche_de_mas_de_50000_euros_false() {
        Bien bien = new Bien();
        bien.tipo = "coche";
        bien.valor = 60000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void coche_de_menos_de_50000_euros_true(){
        Bien bien = new Bien();
        bien.tipo = "coche";
        bien.valor = 30000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void coche_de_valor_negativo_false(){
        Bien bien = new Bien();
        bien.tipo = "coche";
        bien.valor = -10;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
    @Test
    public void coche_de_valor_0_true(){
        Bien bien = new Bien();
        bien.tipo = "coche";
        bien.valor = 0;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void coche_de_valor_justo_50000_true(){
        Bien bien = new Bien();
        bien.tipo = "coche";
        bien.valor = 50000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertTrue(esCorrectoBien);
    }
    @Test
    public void tipo_bien_no_valido_false() {
        Bien bien = new Bien();
        bien.tipo = "novalido";
        bien.valor = 60000;
        boolean esCorrectoBien = bien.esCorrectoBien();
        assertFalse(esCorrectoBien);
    }
}
