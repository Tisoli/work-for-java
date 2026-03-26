package Herencia;

public class Trabajador extends Empleado {
    private String codigoEmpleado;

    public Trabajador(String nombre, int edad, String dni, String codigoEmpleado)
            throws Validaciones.ValidarNIFException, Validaciones.RangoDeEdadException {
        super(nombre, edad, dni);
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }
}