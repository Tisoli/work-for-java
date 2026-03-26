// Se tienen almacenados en la memoria 3 números. Imprimir el mayor de ellos (el algoritmo debe seguir funcionando correctamente independientemente de los valores que tengamos guardados).

public class numeromayor {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 50;
        int num3 = 45;

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}