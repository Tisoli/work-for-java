public class Estudiante extends PersonaFacultad
{
	private int curso;
	
	
	public Estudiante(String nombreApellidos, String dni, String estadoCivil, int curso)
	{
		super(nombreApellidos, dni, estadoCivil);
		this.curso = curso;
	
	}
	
	public String toString()
	{
		return super.toString()+"\n  curso: "+this.curso;
	
	}


}
