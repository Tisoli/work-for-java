public class Profesores extends EmpleadoFacultad {

    private int departamento;

	public Profesores(String nombreApellidos,
					String dni,
					String estadoCivil,
					String añoIncorp,
					int numDespacho,
					int departamento) {

		super(nombreApellidos, dni, estadoCivil, añoIncorp, numDespacho);

		if (nombreApellidos.equals("") || dni.equals("") || estadoCivil.equals("") || añoIncorp.equals("")) {
			throw new NullPointerException("Nombre, DNI, estado civil o año de incorporación vacíos");
		}

		this.departamento = departamento;
	}

    public String toString() {
            return super.toString()+ "\n año incorporacion: " + this.añoIncorp + "\n numero despacho: " + this.numDespacho + "\n numero departamento: " + this.departamento;
    }
}