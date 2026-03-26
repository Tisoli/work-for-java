package JAVA.Tema4;

import java.util.StringTokenizer;

public class Eje4 {

    // public static String primeroNombre(String nombreCompleto) {
    // StringTokenizer st = new StringTokenizer(nombreCompleto);
    // StringBuilder total = new StringBuilder();

    // while (st.hasMoreTokens()) {
    // String palabra = st.nextToken();
    // total.append(palabra.charAt(0));
    // total.append(".");
    // }
    // return total.toString();
    // }
    public String iniciales(String nombre) {
        String iniciales = "";
        StringTokenizer st = new StringTokenizer(nombre, " ");
        while (st.hasMoreTokens()) {
            iniciales += st.nextToken().charAt(0);
        }
        System.out.println(iniciales);
        return iniciales;
    }

    public static String primeroNombrer(String nombreCompleto) {
        String salida ="";
        StringTokenizer st = new StringTokenizer(nombreCompleto," ");

        while (st.hasMoreTokens()) {
            String parte = st.nextToken();
            salida += parte.charAt(0);
            salida += ".";
        }
        return salida;
    }
}
