package JAVA.Tema4;

public class TestRep {
    public static void main(String[] args) {

        final int numero = 560;

        AdministradorRep[] admin = new AdministradorRep[numero];

        for (int i = 0; i < admin.length; i++) {
            admin[i] = new AdministradorRep();
        }
        System.out.println(admin[50].getColor());
        AdministradorRep.setColor("Amalliro");
        System.out.println(admin[50].getColor());

    }
}
