package Herencia;

public class Validaciones 
{

    public static class ValidarNIFException extends Exception 
    {
        public ValidarNIFException(String mensaje) 
        {
            super(mensaje);
        }
    }

    public static class RangoDeEdadException extends Exception 
    {
        public RangoDeEdadException(String mensaje) 
        {
            super(mensaje);
        }
    }

    public boolean validarNIF(String nif) throws ValidarNIFException 
    {
        if (nif == null) 
        {
            throw new NullPointerException("El NIF no puede ser null");
        }

        boolean valido = true;

        if (nif.length() == 9)
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
            
            if (valido) 
            {
                char letra = nif.charAt(8);
                String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
                int numero = Integer.parseInt(numeros);
                int resto = numero % 23;
                char letraCorrecta = letrasValidas.charAt(resto);

                if (letra != letraCorrecta) 
                {
                    valido = false;
                }
            }
        } else 
        {
            valido = false;
        }

        if (!valido)
        {
            throw new ValidarNIFException("NIF inválido");
        }

        return true;
    }

    public boolean validarEdad(int edad) throws RangoDeEdadException 
    {
        if (edad <= 0 || edad >= 150) 
        {
            throw new RangoDeEdadException("Edad fuera de rango");
        }
        return true;
    }
}