public class Malabarista extends Artistas {

    private int numeroObjetos;

    public Malabarista(String nombre, int edad, int actuacion, int objetos)throws ErroresException {
        super(nombre, edad, actuacion);
        this.numeroObjetos = objetos;
    }

    public double calcularPago() {
        double pago = numeroObjetos * getActuacion() * 10;

        if (pago < PAGO_MINIMO) {
            System.out.println("Advertencia: pago menor al mínimo.");
        }

        return pago;
    }
}