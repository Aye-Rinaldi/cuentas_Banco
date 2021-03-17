package ar.com.xeven;

public class CuentaCorriente extends Cuenta{
    //tienen descubierto (saldo negativo)
    private static final Double descubierto = 5000.00;

    //constructor
    public CuentaCorriente(Double saldoInicial) {
        super(saldoInicial);
    }

    //getter para consultar el descubierto
    public static Double getDescubierto() {
        return descubierto;
    }

    //Metodo para extraer dinero=
    @Override
    public void extraer(Double monto) {
        if (monto > (saldo+descubierto))
            return; //no devuelve plata
        super.extraer(monto);
    }
}
