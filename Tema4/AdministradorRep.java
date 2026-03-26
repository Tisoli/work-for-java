package JAVA.Tema4;

public class AdministradorRep extends PersonaRep {

    private static String color = "Rosa";

    public AdministradorRep() {
        super();
    }

    public static void setColor(String color) {
        AdministradorRep.color = color;
    }

    public static String getColor() {
        return AdministradorRep.color;
    }
}
  