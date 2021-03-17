package ar.com.xeven;

public abstract class Cuenta {
    //atributos
    private String moneda;
    protected Double saldo;

    //constructor
    public Cuenta(Double saldoInicial){
        moneda = "ARS";
        saldo = saldoInicial;
    }

    //Metodo para depositar dinero en cuenta
    public void depositar(Double monto){
        saldo += monto;
    }

    //Metodo para extraer el dinero de la cuenta
    public void extraer(Double monto){
        saldo -= monto;
    }

    //consultar saldo
    public Double getSaldo() {
        return saldo;
    }
}
