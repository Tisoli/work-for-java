import java.lang.Exception;
public class Refresco3 {

    public static void main(String[] args) throws Exception {

        int a = 0;
        int b = 300;
        int c;
        try {
            c = b / a;
            System.out.println("cociente de b/a es: " + c);
        } catch (ArithmeticException e) {
            throw new Exception("Se ha producido un error");
        } 
        finally {
            System.out.println("Programa finalizado");
        }
    }

}