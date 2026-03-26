public class Producto {

    private String nombre;
    private double precio;
    public Producto(String nombre,double precio)throws PrecioInvalidoException{
        this.nombre=nombre;
        if(precio<=0){
            throw new PrecioInvalidoException("No puede gratis");
        }
        this.precio=precio;
    }

    public String getDatos(){
        return "Nombre"+ nombre + "Su precio es:" + precio;
    }

}