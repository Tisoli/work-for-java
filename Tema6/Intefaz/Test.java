public class Test {

    public static void main(String[] args) {
        
        Animal a1 = new Gato("Tom", "felinos", 86, "diabetes");
        Animal a2 = new Perro("qweqw", "null", 33);
        Gato a3 = new Gato("Garfield", "felinos", 47, "diabetes");
        a1.hacerSonido();
        a2.hacerSonido();
        a3.hacerSonido();
        System.out.println(a3.mostraInfomacion());
    }
}