// Imprimir en pantalla los 15 primeros números múltiplos de 3.
public class multi3{
    public static void main(String[] args) {
        int contador = 0;
        int numero = 3;
        while (contador < 15) {
            System.out.println(numero);
            numero += 3;
            contador+=1;
        }
    }
}
