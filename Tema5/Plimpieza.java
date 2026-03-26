public class Plimpieza extends EmpleadoFacultad
{
	private int seccion;
	
	public Plimpieza(String nombreApellidos, String dni, String estadoCivil, String añoIncorp, int numDespacho,  int seccion)
	{
	  super(nombreApellidos, dni, estadoCivil, añoIncorp, numDespacho);
	  this.seccion =  seccion;
	}
	
	public String toString()
	{
	  return super.toString()+"\n año incorporacion: "+this.añoIncorp+"\n numero despacho: "+this.numDespacho+"\n numero seccion: "+this.seccion;
	}

}
