// public class MAYaMEN{
//     int[] original;
//     public static int []ordenar(int[]original){
//         boolean hayCambio = false;
//         while(!hayCambio)
//         {
//             hayCambio=true;
//             for(int i=0;i <original.length;i++)
//             {
//                 if(original[i]>original[i+1])
//                 {
//                     int temp = original[i];
//                     original[i]=original[i+1];
//                     original[i+1]=temp;
//                     hayCambio = false;
//                 }
//             }
//         }
//         return original;
//     }
//     public static void main(String[] args) {
//         int[]numero = new int[]{3,2,4,1,7,20};
//         System.out.println(ordenar(numero));
//     }
// }
import java.util.Arrays;
public class MAYaMEN {

    public static int[] ordenar(int[] original) {
        boolean hayCambio = false;

        while (!hayCambio) {
            hayCambio = true;

            for (int i = 0; i < original.length - 1; i++) {
                if (original[i] > original[i + 1]) {
                    int temp = original[i];
                    original[i] = original[i + 1];
                    original[i + 1] = temp;

                    hayCambio = false;
                }
            }
        }
        return original;
    }

    public static void main(String[] args) {
        int[] numero = new int[]{3,2,4,1,7,20};
        System.out.println(Arrays.toString(ordenar(numero)));
    }
}