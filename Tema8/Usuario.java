public class Usuario {

    private String nombre;
    private Double credito;
    
    public Usuario(String nombre , Double credito) {
        this.nombre = nombre;
        this.credito = credito;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.credito = 50.0;
    }

    public void incrementarCredito(double candidad) {
        this.credito += candidad;
    }

    public void dereminarCredito(double cantidad) {
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