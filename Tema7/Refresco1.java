import java.lang.Exception;
public class Refresco1 {

    public static void main(String[] args) {

        int a = 0;
        int b = 300;
        int c;
        try {
            c = b / a;
            System.out.println("Cociente de b/a es: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
