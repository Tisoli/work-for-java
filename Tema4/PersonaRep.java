package JAVA.Tema4;

public class PersonaRep {
    private String nombre;
    private int edad;
    public PersonaRep(){
        this.nombre="Tiso";
        this.edad=18;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
}