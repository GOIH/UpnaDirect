package upnadirect;

import java.time.LocalDate;

class Cliente {
    int anioNacimiento;
    double salarioAnual;

    public Cliente(int anioNacimiento, double salarioAnual) {
        this.anioNacimiento = anioNacimiento;
        this.salarioAnual = salarioAnual;
    }

    public Cliente() {
        this.anioNacimiento = 0;
        this.salarioAnual = 0;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public boolean esEdadValida() {
        return anioNacimiento >= 1900 && anioNacimiento < LocalDate.now().getYear();
    }

    public boolean esSalarioValido() {
        return salarioAnual >= 0;
    }

    public int calcularEdad() {
        return LocalDate.now().getYear() - anioNacimiento;
    }
}
