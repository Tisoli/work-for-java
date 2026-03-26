package Herencia;

public class Empleado {
    protected String nombre;
    protected int edad;
    protected String dni;

    public Empleado(String nombre, int edad, String dni)
            throws Validaciones.ValidarNIFException, Validaciones.RangoDeEdadException 
    {
        if (nombre == null) 
        {
            throw new NullPointerException("El nombre no puede ser null");
        }
        Validaciones v = new Validaciones();
        v.validarEdad(edad);
        v.validarNIF(dni);

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}
