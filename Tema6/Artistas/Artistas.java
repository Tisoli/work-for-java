public abstract class Artistas {

    private String nombre;
    private int edad;
    private int actuacion;

    private static int totalArtistas = 0;
    public static final double PAGO_MINIMO = 100;

    public Artistas(String nombre, int edad, int actuacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.actuacion = actuacion;
        totalArtistas++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getActuacion() {
        return actuacion;
    }

    public static int getTotalArtistas() {
        return totalArtistas;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Actuación: " + actuacion);
    }



    public abstract double calcularPago();
}






