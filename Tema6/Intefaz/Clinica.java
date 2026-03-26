public abstract class Clinica{

    protected String nombre;
    protected String tipo;
    protected int edad;

    public Clinica (String nombre,String tipo,int edad){
        this.nombre=nombre;
        this.tipo=tipo;
        this.edad=edad;

    }

    public abstract String mostraInfomacion();

}