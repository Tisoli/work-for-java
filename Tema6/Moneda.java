import java.util.Random;
public class Moneda extends Sorteo{
    private Random rand = new Random();
    public Moneda()
    {
        this.posibilidades=2;
    }
    public int lanzar()
    {
        return rand.nextInt(posibilidades);
    }
    
}