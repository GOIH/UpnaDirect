package upnadirect;

public interface IVistaAseguradora {
    int solicitarAnoNacimiento();
    double solicitarSalario();
    double solicitarValorBien();
    String solicitarTipoBien();
    void errorCliente();
    void errorBien();
    void mostrarOfertaEnConsola(Aseguradora mafro, Aseguradora lineaIndirecta, Aseguradora adasles, Aseguradora mejor);

}
