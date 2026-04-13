public class Usuario {

    private String nombre;
    private Double credito;
    private final double creditoInicial = 50.0;

    public Usuario(String nombre , Double credito) {
        this.nombre = nombre;
        this.credito = credito;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.credito = creditoInicial;
    }

    public void incrementarCredito(double candidad) {
        this.credito += candidad;
    }

    public void decrementarCredito(double cantidad) {
        if (cantidad <= this.credito) {
            this.credito -= cantidad;
        } else {
            System.out.println("No tienes suficiente crédito.");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public Double getCredito() {
        return credito;
    }

    
}