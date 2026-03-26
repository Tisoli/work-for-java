
public class ExceptionDeBanco {

    public static class SaldoInsuficienteException extends Exception
    {
        public SaldoInsuficienteException(String mensaje){
            super(mensaje);
        }
    }
    public void noHayDinero(int saldo) throws SaldoInsuficienteException{
        if(saldo <0){
            throw new SaldoInsuficienteException("Tu no tiene dinero");
        }
    }
}
