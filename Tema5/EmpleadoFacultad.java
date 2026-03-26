public class EmpleadoFacultad extends PersonaFacultad
{
	protected String añoIncorp;
	protected int numDespacho;
	
	public EmpleadoFacultad(String nombreApellidos, String dni, String estadoCivil, String añoIncorp, int numDespacho)
	{
	  super(nombreApellidos, dni, estadoCivil);
	  this.añoIncorp = añoIncorp;
	  this.numDespacho = numDespacho;
	}
	
	public String toString()
	{
	  return super.toString()+"\n año incorporacion: "+this.añoIncorp+"\n numero despacho: "+this.numDespacho;
	}
}
