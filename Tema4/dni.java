package JAVA.Tema4;
public class dni {
public boolean validarNIF(String nif) {
        boolean valido = true;

        if (nif != null && nif.length() == 9)
        {

            String numeros = nif.substring(0, 8);

            for (int i = 0; i < numeros.length(); i++)
            {
                char c = numeros.charAt(i);
                if (c < '0' || c > '9')
                {
                     valido = false;
                }
            }
            if(valido)
            {
                char letra = nif.charAt(8);
                String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
                int numero = Integer.parseInt(numeros);
                int resto = numero % 23;
                char letraCorrecta = letrasValidas.charAt(resto);
                if(letra != letraCorrecta)
                {
                    valido = false;
                }
            }
        }
        else
        {
            valido = false;
        }
        return valido;
    }
}