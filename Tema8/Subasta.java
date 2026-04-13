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
}