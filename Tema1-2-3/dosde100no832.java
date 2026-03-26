// Imprimir en pantalla las potencias de 2 menores que 100 exceptuando el 8 y el 32.
public class dosde100no832{
    public static void main(String[] args){
        int num1=1;
        while(num1 <= 100){
            if(num1 != 8 && num1 != 32){
                System.out.println(num1);
            }
            num1 *=2;
        }
    }
}