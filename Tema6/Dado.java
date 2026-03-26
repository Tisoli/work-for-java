package JAVA.Tema6;
import java.util.Random;
public class Dado extends Sorteo{
    private Random rand = new Random();
    public Dado(){
        this.posibilidades=6;
    }
    public int lanzar()
    {
        return rand.nextInt(posibilidades) + 1;
    }
}   