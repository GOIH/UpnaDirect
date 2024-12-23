package upnadirect;

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

    public boolean esCorrectoBien() {
        if ("vivienda".equals(tipo)) {
            return valor >= 50000;
        }
        if ("vehiculo".equals(tipo)) {
            return valor <= 50000 && valor >= 0;
        }
        return false;
    }
}
