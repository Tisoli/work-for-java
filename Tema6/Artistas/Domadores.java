public class Domadores extends Artistas {

    private int numeroAnimales;

    public Domadores(String nombre, int edad, int actuacion, int animales)throws ErroresException {
        super(nombre, edad, actuacion);
        this.numeroAnimales = animales;
    }

    public double calcularPago() {
        double pago = numeroAnimales * getActuacion() * 8;

        if (pago < PAGO_MINIMO) {
            System.out.println("Advertencia: pago menor al mínimo.");
        }

        return pago;
    }
}