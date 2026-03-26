public class PruebaFacultad
{
	public static void main(String[] args)
	{
		Profesores paco = new Profesores("tipi", "1234", "soltero", "2025",123,123);
		System.out.println(paco.toString());
		
		System.out.println(" ");
		
		Plimpieza ro = new Plimpieza("Cristo Limpiador", "34455678X", "casado", "2023", 1, 18);
		System.out.println(ro.toString());
		
		System.out.println(" ");
		
		Estudiante vo = new Estudiante("Cristo Estudiante", "2223344X", "soltero", 2025);
		System.out.println(vo.toString());
	
	
	}

}
