import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

public class Estudiantes {

    private String id;
    private String nombre;
    private LocalDate nacimiento;
    private Map<String, Double> clasesYNota;

    public Estudiantes(String id, String nombre, LocalDate nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.clasesYNota = new HashMap<>();
    }

    public void anadirClasesYNota(String nombreDeClase, double nota) {
        clasesYNota.put(nombreDeClase, nota);
    }

    public double medioNota() {
        if (clasesYNota.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double nota : clasesYNota.values()) {
            sum += nota;
        }
        return sum / clasesYNota.size();
    }

    public String getNombre() {
        return this.nombre;
    }
}
