package ar.com.xeven;

import sun.dc.DuctusRenderingEngine;

public abstract class Cliente {
    //atributos
    private CuentaCorriente ctaCorriente;
    private CajaDAhorro cajaDeAhorro;

    //constructor
    public Cliente(Double saldoInicial){
        ctaCorriente = new CuentaCorriente(saldoInicial);
        cajaDeAhorro = new CajaDAhorro(saldoInicial);

    }

    //getters
    public CuentaCorriente getCtaCorriente() {
        return ctaCorriente;
    }

    public CajaDAhorro getCajaDeAhorro() {
        return cajaDeAhorro;
    }

    //Metodo para pedir prestamos
    public void obtenerPrestamo(Double monto){
        //iniciar tramite de solicitud de prestamo
        //si se aprueba
        cajaDeAhorro.depositar(monto);
    }

}
