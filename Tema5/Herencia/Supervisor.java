package Herencia;

public class Supervisor extends Empleado {
    private String codigoSupervisor;

    public Supervisor(String nombre, int edad, String dni, String codigoSupervisor)
            throws Validaciones.ValidarNIFException, Validaciones.RangoDeEdadException {
        super(nombre, edad, dni);
        this.codigoSupervisor = codigoSupervisor;
    }

    public void setCodigoSupervisor(String codigoSupervisor) {
        this.codigoSupervisor = codigoSupervisor;
    }

    public String getCodigoSupervisor() {
        return codigoSupervisor;
    }
}