public class Perro extends Clinica{

    public Perro(String nombre, String tipo, int edad) {
        super(nombre, tipo, edad);
    }

    public String mostraInfomacion() {
        return "Nombre: " + super.nombre + "Tipo :" + super.tipo + "Edad:" + super.edad;
    }

    public void hacerSonido() {
        System.out.println("Guau");
    }


}