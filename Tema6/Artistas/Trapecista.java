public class Trapecista extends Artistas {

    private double alturaMaxima;

    public Trapecista(String nombre, int edad, int actuacion, double altura)throws ErroresException {
        super(nombre, edad, actuacion);
        this.alturaMaxima = altura;
    }

    public double calcularPago() {
        double pago = alturaMaxima * getActuacion() * 5;

        if (pago < PAGO_MINIMO) {
            System.out.println("Advertencia: pago menor al mínimo.");
        }

        return pago;
    }
}