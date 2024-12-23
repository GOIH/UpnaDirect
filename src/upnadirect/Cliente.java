package upnadirect;

import java.beans.*;
import java.io.Serializable;
import java.time.LocalDate;
class Cliente {
    int añoNacimiento;
    double salarioAnual;

    public Cliente(int añoNacimiento, double salarioAnual) {
        this.añoNacimiento = añoNacimiento;
        this.salarioAnual = salarioAnual;
    }
    public Cliente() {
        this.añoNacimiento = 0;
        this.salarioAnual = 0;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }
    public boolean esEdadValida(){
        return((añoNacimiento >= 1900 && añoNacimiento < LocalDate.now().getYear()));
    }
    
    public boolean esSalarioValido(){
        return(salarioAnual >= 0);
    }
    
    public int calcularEdad(){
        return(LocalDate.now().getYear() - añoNacimiento);
    }
}