
public class Refresco4 {

    

public static String Refresco4(char[][] matriz) {
    String resultado = "";

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            resultado += matriz[i][j];
        }
    }

    return resultado;
    }
}

// public static String Refresco4(char[][] matriz) {
//     if (matriz == null) {
//         throw new NullPointerException("矩阵为 null");
//     }

//     String resultado = "";

//     for (int i = 0; i < matriz.length; i++) {
//         if (matriz[i] == null) {
//             throw new NullPointerException("第 " + i + " 行为 null");
//         }
//         for (int j = 0; j < matriz[i].length; j++) {
//             resultado += matriz[i][j];
//         }
//     }

//     return resultado;
// }