public class TestProducto {

    public static void main(String[] args) {
        try{
        Producto manzana = new Producto("manzana", -1.00);
        }
        catch(PrecioInvalidoException e){
            System.out.println(e);
        }
    }
}