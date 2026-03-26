import java.util.ArrayList;
public class TestArtista {
    public static void main(String[] args) {
        try {
            Artistas a1 = new Trapecista("SweetieFox", 20, 10, 87.4);
            Artistas a2 = new Malabarista("Candy Love", 21, 8, 12);
            Artistas a3 = new Domadores("Honeymoon", 30, 3, 12);
            double dinero = 0;
            
            
            ArrayList <Artistas> rileyReid = new ArrayList<Artistas>();
            rileyReid.add(a1);
            rileyReid.add(a2);
            rileyReid.add(a3);
            
            for (int i = 0; i < rileyReid.size(); i++) {
                Artistas uwu = rileyReid.get(i);

                System.out.println(uwu.toString() + " Pago: " + uwu.getTotalArtistas());
            }

            for (int i = 0; i < rileyReid.size(); i++){
                Artistas uwu = rileyReid.get(i);
                dinero += uwu.getTotalArtistas();
            }

            System.out.println("Dinero gastado en los artistas: " + dinero);

            System.out.println("Numero de Artistas: " + Artistas.getTotalArtistas());
        } catch (ErroresException e) {
            System.out.println(e.getMessage());
        }
    }
}