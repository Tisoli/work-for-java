import java.util.ArrayList;

public class Subasta {

    private String nombreDelProducto;
    private Usuario propietario;
    private boolean abierta;
    private ArrayList<Puja> pujas;
    private Puja pujaMayor;

    public Subasta(String nombreDelProducto, Usuario propietario) {
        this.nombreDelProducto = nombreDelProducto;
        this.propietario = propietario;
        this.abierta = true;
        this.pujas = new ArrayList<>();
        this.pujaMayor = null;
    }

    public boolean pujar(Usuario pujador, double cantidad) {
        boolean aceptada = false;
        if (abierta) {
            if (pujador != propietario) {
                if (pujador.getCredito() >= cantidad) {
                    if (pujaMayor == null || cantidad > pujaMayor.getCantidad()) {
                        Puja nuevaPuja = new Puja(pujador, cantidad, this);
                        this.pujas.add(nuevaPuja);
                        this.pujaMayor = nuevaPuja;
                        aceptada = true;

                    }
                }
            }
        }
        return aceptada;
    }

    public boolean pujar(Usuario usuario) {
        boolean aceptada = false;
        double cantidad;

        if (this.pujaMayor == null) {
            cantidad = 1.0;
        } else {
            cantidad = this.pujaMayor.getCantidad() + 1.0;
        }

        aceptada = this.pujar(usuario, cantidad);

        return aceptada;
    }

    public boolean ejecutar() {
        boolean ejecutada = false;

        if (this.abierta) {
            if (this.pujaMayor != null) {
                Usuario ganador = this.pujaMayor.getPujador();
                double cantidad = this.pujaMayor.getCantidad();

                ganador.decrementarCredito(cantidad);
                this.propietario.incrementarCredito(cantidad);

                this.abierta = false;
                ejecutada = true;
            }
        }

        return ejecutada;
    }

    public Puja getPujaMayor() {
        Puja resultado = this.pujaMayor;
        return resultado;
    }
}