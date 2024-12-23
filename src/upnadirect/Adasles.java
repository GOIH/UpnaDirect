package upnadirect;

class Adasles extends Aseguradora {
    public Adasles(Cliente cliente, Bien bien){
        super(cliente, bien);
        this.importe = calcularImporte();
        this.comision = calcularComision();
        this.nombre = "Adasles";
    }
    @Override
    public double calcularImporte() {
        double porcentaje = 0.02;

        if (this.bien.getTipo().equalsIgnoreCase("vehículo") &&
                ((2023 - this.cliente.getAñoNacimiento()) < 20 || (2023 - this.cliente.getAñoNacimiento()) > 60)) {
            porcentaje = 0.06;
        }

        return this.bien.getValor() * porcentaje;
    }

    @Override
    public double calcularComision() {
        if (this.importe <= 1000) {
            return Math.floor(0.01 * this.importe);
        } else {
            return Math.floor(0.05 * this.importe);
        }
    }
}