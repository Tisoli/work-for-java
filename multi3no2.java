// Imprimir en pantalla los 15 primeros números múltiplos de 3, que no sean múltiplos de 2.
public class multi3no2 { 
    public static void main(String[]args) {
        int numero = 3;
        int contador = 0;
        while (contador < 15) {
            if (numero % 2 != 0) {
                System.out.println(numero);

                contador += 1;
            }
            numero += 3;
        }
    }
}