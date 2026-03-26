package JAVA.Tema6;
public class TestCasino {
    public static void main(String[] args) {
        Dado cliente1= new Dado();
        Dado cliente2= new Dado();
        Moneda cliente3= new Moneda();
        Moneda cliente4= new Moneda();

        System.out.println(cliente1.lanzar());
        System.out.println(cliente2.lanzar());
        System.out.println(cliente3.lanzar());
        System.out.println(cliente4.lanzar());
        System.out.println(cliente1.lanzar());
        System.out.println(cliente2.lanzar());
        System.out.println(cliente3.lanzar());
        System.out.println(cliente4.lanzar());
    }
}