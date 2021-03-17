package ar.com.xeven;

public class ClienteEmpresa extends Cliente{

    public ClienteEmpresa(Double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void obtenerPrestamo(Double monto) {
        System.out.println("Las empresas no pueden pedir prestamos.");
    }
}
