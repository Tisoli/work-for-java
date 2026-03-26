package JAVA.Tema4;

public class TestEje5 
{
    public static void main(String[] args) 
    {
        String nif1 = "12345678Z";
        String nif2 = "1234A678Z";

        System.out.println("NIF " + nif1 + " válido: " +
                Eje5.validarNIF(nif1));
        System.out.println("NIF " + nif2 + " válido: " +
                Eje5.validarNIF(nif2));
    }
}