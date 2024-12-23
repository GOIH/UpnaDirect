package upnadirect;

import java.beans.*;
import java.io.Serializable;
class Bien {
    String tipo;
    double valor;

    public Bien(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    public Bien() {
        this.tipo = null;
        this.valor = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
    public boolean esCorrectoBien(){
        if(tipo.equals("vivienda")){
            return(valor >= 50000);
        }
        if(tipo.equals("vehiculo")){
            return(valor <= 50000 && valor >= 0);
        }
        return(false);
    }
}