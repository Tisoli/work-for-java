// Dado un precio guardado internamente en tu programa, escribe el código necesario para mostrar el precio final con iva, teniendo en cuenta de que en caso de que el precio sin iva sea menor de 100 no se aplicará ningún descuento, pero en caso de que el precio sin iva sea mayor o igual a 100 se aplicará un descuento del 5%.

public class descuento {
    public static void main(String[] args) {
        double preciosiniva = 82.64;
        double iva = 0.21;
        double descuento = 0.05;
        double precioconiva = preciosiniva * (1 + iva);
        double precioFinal;
        System.out.printf("El precio con IVA es: %.2f", precioconiva);

        if (precioconiva >= 100) {
            precioFinal = precioconiva * (1 - descuento);
        } else {
            precioFinal = precioconiva; 
        }

        System.out.printf("El precio final es: %.2f", precioFinal);
    }
}

