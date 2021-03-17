package ar.com.xeven;
/*
Se modelan las cuentas de un banco
Un cliente puede tener una Cuenta Corriente o una Caja de Ahorro
En ambos tipos de cuentas se pueden realizar depositos y extracciones
Las cuentas corrientes tienen un descubierto (saldo negativo)

 */

public class Main {

    public static void main(String[] args) {

        //creo un cliente individuo
        ClienteIndividuo maria = new ClienteIndividuo(10000.00);

        //le creo una caja de ahorro
        CajaDAhorro cdaMaria = maria.getCajaDeAhorro();
        cdaMaria.depositar(1000.00);
        cdaMaria.extraer(2500.00);
        System.out.println("El saldo en la caja de ahorro de Maria es: "+cdaMaria.getSaldo());
        System.out.println();
        //le creo una cuenta corriente
        CuentaCorriente ccteMaria = maria.getCtaCorriente();
        ccteMaria.getSaldo();
        ccteMaria.extraer(2000.00);
        System.out.println("El saldo en la Cuenta Corriente de Maria es: "+ccteMaria.getSaldo());
        System.out.println();
        //Maria pide un prestamos
        maria.obtenerPrestamo(3000.00);
        System.out.println("Saldo en la Caja de Ahorro de Maria: "+cdaMaria.getSaldo());
        System.out.println();

        //el cliente Pymes pide un prestamo
        ClientePymes pymes = new ClientePymes(500.00);
        pymes.obtenerPrestamo(5000.00);
        System.out.println("Monto: "+pymes.getCajaDeAhorro().getSaldo());
        System.out.println();
        //la empresa pide un prestamo
        ClienteEmpresa empresa = new ClienteEmpresa(2000.00);
        empresa.obtenerPrestamo(6000.00);











    }
}
