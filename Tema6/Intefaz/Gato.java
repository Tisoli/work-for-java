public class Gato extends Clinica  implements Animal{
    
    private String enfermedad;
    
    public Gato(String nombre,String tipo,int edad,String enfermedad){
        super(nombre, tipo, edad);
        this.enfermedad=enfermedad;
    }
    
    public String mostraInfomacion(){
        return "Nombre: " + super.nombre + "Tipo :" +super.tipo + "Edad:" + super.edad + "Tiene" + this.enfermedad;
    }

    public void hacerSonido(){
        System.out.println("Maullido");
    }


    
}