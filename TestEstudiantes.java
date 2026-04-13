import java.time.LocalDate;
public class TestEstudiantes {

    public static void main(String[] args) {

        Estudiantes e1 = new Estudiantes("S01", "sihao", LocalDate.of(2006, 04, 22));
        e1.anadirClasesYNota("Programa", 10);
        e1.anadirClasesYNota("Sisteam", 10);
        e1.anadirClasesYNota("LM", 5);
        System.out.println(e1.getNombre() +"Tiene un nota medio : "+ e1.medioNota());
    }
}