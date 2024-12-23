
package upnadirect;

public class EjecutorAseguradora {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Bien bien = new Bien();
        Aseguradora mejorAseg = new Aseguradora(cliente, bien);
        
        
        Presentador presentador = new Presentador(new VistaConsola());
        cliente = presentador.solicitarCliente();
        bien = presentador.solicitarBien();
       
        
        
        presentador.ofrecerOfertaMasVentajosa(cliente, bien);        
    }
}
    
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año de nacimiento del cliente:");
        int añoNacimiento = scanner.nextInt();

        System.out.println("Ingrese el salario anual del cliente:");
        double salarioAnual = scanner.nextDouble();

        System.out.println("Ingrese el tipo de bien (vehículo o vivienda):");
        String tipoBien = scanner.next();

        System.out.println("Ingrese el valor del bien:");
        double valorBien = scanner.nextDouble();

        Cliente cliente = new Cliente(añoNacimiento, salarioAnual);
        Bien bien = new Bien(tipoBien, valorBien);

        Presentador presentador = new Presentador();
        presentador.ofrecerOfertaMasVentajosa(cliente, bien);
    }
}*/
