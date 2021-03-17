package ar.com.xeven;

public class CajaDAhorro extends Cuenta{

    //constructor
    public CajaDAhorro(Double saldoInicial) {
        super(saldoInicial);
    }

    //Extraer dinero de cuenta

    @Override
    public void extraer(Double monto) {
        if (monto <= saldo)
            super.extraer(monto);
    }
}
