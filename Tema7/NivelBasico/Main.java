// 自定义异常
class CantidadNegativaException extends Exception {
    public CantidadNegativaException(String mensaje) {
        super(mensaje);
    }
}

// Persona 类
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// CuentaAhorro 类
class CuentaAhorro {
    private Persona titular;
    private double saldo;

    public CuentaAhorro(Persona titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) throws CantidadNegativaException {
        if (cantidad <= 0) {
            throw new CantidadNegativaException("La cantidad debe ser mayor que 0");
        }
        saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        CuentaAhorro cuenta = new CuentaAhorro(p, 100);

        try {
            cuenta.depositar(-50); // probar cantidad negativa
        } catch (CantidadNegativaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}