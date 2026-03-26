public class PersonaFacultad
{
	private String nombreApellidos;
	private String dni;
	private String estadoCivil;
	
	public PersonaFacultad(String nombreApellidos, String dni, String estadoCivil)
	{
		this.nombreApellidos = nombreApellidos;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
	}
	
	public String toString()
	{
	  return "Nombre y apellidos: "+this.nombreApellidos+"\n dni: "+this.dni+"\n estado civil: "+this.estadoCivil;
	}

}
