import java.util.Scanner;
public class NumeroPerfecto 
{
    public static void main(String[] args) 
    {
        //1 crea variable
        int num, divisor, sumadivisores;
        //2 definir variable
        divisor = 1;
        sumadivisores = 0;
        //3 pone numero
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero mayor que 0: ");
        num = entrada.nextInt();
        //4 entra while
        while (divisor <= num / 2) 
        {
        //5 entra if
            if (num % divisor == 0) 
            {
                sumadivisores = sumadivisores + divisor;
            }
            divisor++;
        //6 fin fin

        //7fin while
        }
        //8entra if
        if (num == sumadivisores) 
        {
            System.out.println("El numero " + num + " es un numero perfecto");
        }
        //9 entra else
        else 
        {
            System.out.println("El numero " + num + " no es un numero perfecto");

        }
        //10 fin if y fin
    }
}
//camino1:1 1-2-3-4-7-8-10(No entra while)
//camino2:1-2-3-4-5(false)-6-4-7-9-10(Entra while pero false)
//camino3:1-2-3-4-5(true)-6-4-7-9-10(Entra while pero no es)
//camino4:1-2-3-4-5(true)-6-4-7-8-10(Entra while es perfecto!)