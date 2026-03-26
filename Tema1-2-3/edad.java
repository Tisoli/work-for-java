// Imprimir en pantalla la paga que le corresponde a un chaval cuya edad tienes guardada en memoria. Si es mayor de edad recibirá 12 euros y en caso contrario 5.
public class edad {
    public static void main(String[] args) {
        int edad = 20;
        int paga;

        if (edad >= 18) {
            paga = 12;
        } else {
            paga = 5;
        }

        System.out.println("La paga que le corresponde es: " + paga + " euros.");
    }
}