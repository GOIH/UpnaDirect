package upnadirect;

public final class EjecutorAseguradora {
    
    // Constructor privado para evitar la instanciación de la clase
    private EjecutorAseguradora() {
        throw new UnsupportedOperationException("Esta clase no debe ser instanciada.");
    }
    
    public static void main(String[] args) {
        Presentador presentador = new Presentador(new VistaConsola());
        Cliente cliente = presentador.solicitarCliente();
        Bien bien = presentador.solicitarBien();

        presentador.ofrecerOfertaMasVentajosa(cliente, bien);
    }
}
