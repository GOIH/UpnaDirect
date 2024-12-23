package upnadirect;

class LineaIndirecta extends Aseguradora {
    public LineaIndirecta(Cliente cliente, Bien bien){
        super(cliente, bien);
        this.importe = calcularImporte();
        this.comision = calcularComision();
        this.nombre = "Linea Indirecta";
    }
    @Override
    public double calcularImporte() {
        double porcentaje = 0.03;

        if (this.bien.getTipo().equalsIgnoreCase("vehículo") && this.bien.getValor() < 20000) {
            porcentaje = 0.04;
        } else if (this.bien.getTipo().equalsIgnoreCase("vivienda") && this.bien.getValor() < 150000) {
            porcentaje = 0.04;
        } else if (this.bien.getTipo().equalsIgnoreCase("vehículo") && (2023 - this.cliente.getAñoNacimiento()) > 60) {
            porcentaje = 0.06;
        }

        return this.bien.getValor() * porcentaje;
    }

    @Override
    public double calcularComision() {
        if (this.importe <= 1000) {
            return Math.floor(0.01 * this.importe);
        } else {
            return Math.floor(0.04 * this.importe);
        }
    }
}