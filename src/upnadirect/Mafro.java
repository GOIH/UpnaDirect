package upnadirect;

class Mafro extends Aseguradora {
    public Mafro(Cliente cliente, Bien bien){
        super(cliente, bien);
        this.importe = calcularImporte();
        this.comision = calcularComision();
        this.nombre = "Mafro";
    }
@Override
    public double calcularImporte() {
        double porcentaje = 0.03;

        if (this.bien.getTipo().equalsIgnoreCase("vehículo") && (2023 - this.cliente.getAñoNacimiento()) < 20) {
            porcentaje = 0.05;
        } else if (this.bien.getTipo().equalsIgnoreCase("vivienda") && this.bien.getValor() > 200000 &&
                this.cliente.getSalarioAnual() < 20000) {
            porcentaje = 0.02;
        }

        return this.bien.getValor() * porcentaje;
    }

    @Override
    public double calcularComision() {
        if (this.importe <= 1000) {
            return Math.floor(0.01 * this.importe);
        } else {
            return Math.floor(0.03 * this.importe);
        }
    }
}
