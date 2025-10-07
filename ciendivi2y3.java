// Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.

public class ciendivi2y3{
    public static void main(String[]args){
        for (int numero = 0; numero <= 100; numero++){
            if ((numero % 2 == 0) && (numero % 3 == 0)){
                System.out.println(numero);
            }
        }
    }
}



