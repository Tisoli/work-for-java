public class Banco {

    private String titular;
    private double saldo;
    public Banco(){
        this.titular="Tiso";
        this.saldo= 2000000.00;
    }
    public Banco (String titular,double saldo)  {    
    this.titular=titular;
        this.saldo=saldo;
    }
    public void retirar(double cantidad) throws ExceptionDeBanco.SaldoInsuficienteException{
        if(cantidad > this.saldo){
            throw new ExceptionDeBanco.SaldoInsuficienteException("Saldo insuficiente");
        }
        else if (cantidad>0){
            this.saldo -= cantidad;
        }
    }









    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {    
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
}