public class ArrayReales implements Estadisticas {

    private double[] datos;

    public ArrayReales(double[] datos) {
        this.datos = datos;
    }

    @Override
    public double minimo() {
        double min = datos[0];
        for (double d : datos) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max = datos[0];
        for (double d : datos) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double suma = 0;
        for (double d : datos) {
            suma += d;
        }
        return suma;
    }
}