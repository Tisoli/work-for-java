// Imprimir en pantalla la suma de los 15 primeros números impares.
public class suma15{
    public static void main(String[] args) {
        int suma = 0;
        int contador = 0;
        int numero = 1;
        while (contador < 15) {
            suma += numero;
            numero += 2;
            contador +=1;
        }
        System.out.println("La suma de los 15 primeros números impares es: " + suma);
    }
}