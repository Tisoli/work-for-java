
import java.io.IOException;

public class Eje8 {

    private static int metodo() {
        int valor = 0;
        try {
            valor += 1;
            valor += Integer.parseInt("W");
            valor += 1;
            System.out.println("Valor al final del try: " + valor);
            throw new IOException();
        } catch (IOException e) {
            valor += Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor += 1;
            System.out.println("Valor al final del finaqlly: " + valor);
        }
        valor += 1;
        System.out.println("Valor al final del teturn: " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
}