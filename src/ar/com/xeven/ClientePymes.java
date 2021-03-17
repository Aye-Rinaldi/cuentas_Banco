package ar.com.xeven;

public class ClientePymes extends Cliente{

    public ClientePymes(Double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void obtenerPrestamo(Double monto) {
        super.obtenerPrestamo(monto);
    }
}
