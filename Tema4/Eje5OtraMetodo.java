package JAVA.Tema4;
import java.lang.Character;
public class Eje5OtraMetodo {

    public boolean validarNIF(String nif) {
        if (nif == null || nif.length() != 9) {
            return false;
        }

        String numeros = nif.substring(0, 8);

        for (int i = 0; i < numeros.length(); i++) {
            if (!Character.isDigit(numeros.charAt(i))) {
                return false;
            }
        }

        char letra = nif.charAt(8);
        String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";

        int numero = Integer.parseInt(numeros);
        int resto = numero % 23;
        char letraCorrecta = letrasValidas.charAt(resto);

        return letra == letraCorrecta;
    }
}