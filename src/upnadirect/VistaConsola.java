package upnadirect;

import java.util.Scanner;

public class VistaConsola implements IVistaAseguradora {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int solicitarAnoNacimiento() {
        System.out.println("Introduce el año de nacimiento del cliente: ");
        return scanner.nextInt();
    }

    @Override
    public double solicitarSalario() {
        System.out.println("Introduce el salario del cliente en euros: ");
        return scanner.nextDouble();
    }

    @Override
    public double solicitarValorBien() {
        System.out.println("Introduce el valor del bien: ");
        return scanner.nextDouble();
    }

    @Override
    public String solicitarTipoBien() {
        System.out.println("Introduce el tipo del bien: ");
        String tipo = scanner.next(); // Lee el tipo de bien // Limpiar el salto de línea pendiente
        return tipo;
    }

    @Override
    public void errorCliente() {
        System.out.println("\u001B[31mError: Los datos del cliente no son válidos\u001B[0m");
    }

    @Override
    public void errorBien() {
        System.out.println("\u001B[31mError: Los datos del bien no son válidos\u001B[0m");
    }

    @Override
    public void mostrarOfertaEnConsola(Aseguradora mafro, Aseguradora lineaIndirecta, Aseguradora adasles, Aseguradora mejor) {
        // Colores ANSI para resaltar las salidas en la consola
        String reset = "\u001B[0m";
        String amarillo = "\u001B[33m";
        String azul = "\u001B[36m";

        System.out.println(amarillo + mafro.nombre + " | Importe: " + mafro.importe + " | Comisión: " + mafro.comision + reset);
        System.out.println(amarillo + lineaIndirecta.nombre + " | Importe: " + lineaIndirecta.importe + " | Comisión: " + lineaIndirecta.comision + reset);
        System.out.println(amarillo + adasles.nombre + " | Importe: " + adasles.importe + " | Comisión: " + adasles.comision + reset);
        System.out.println(azul + "La mejor oferta es: " + mejor.nombre + " | " + mejor.importe + " | " + mejor.comision + reset);
    }
}
