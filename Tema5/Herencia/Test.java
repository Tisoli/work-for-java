package Herencia;

public class Test {
    public static void main(String[] args) {
        try {
            Empleado supervisor = new Empleado("tiso", 20, "12345678Z");
            System.out.println("Empleado creado: " + supervisor.getNombre());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.toString());
        } catch (Validaciones.ValidarNIFException | Validaciones.RangoDeEdadException e) {
            System.out.println("Error al crear empleado: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}