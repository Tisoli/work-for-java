public class TestBanco {

    public static void main(String[] args) {
        Banco banco = new Banco("Tiso", 2000000.00);
        try {
            banco.retirar(2500000.00);
            System.out.println("Retiro exitoso. Saldo restante: " + banco.getSaldo());
        } catch (ExceptionDeBanco.SaldoInsuficienteException e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }
    }
}   