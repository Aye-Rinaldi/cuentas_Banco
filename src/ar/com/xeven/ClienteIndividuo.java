package ar.com.xeven;

public class ClienteIndividuo extends Cliente{
    //constructor
    public ClienteIndividuo(Double saldoInicial) {
        super(saldoInicial);
    }

    //pide prestamo
    @Override
    public void obtenerPrestamo(Double monto) {
        super.obtenerPrestamo(monto);
    }
}
