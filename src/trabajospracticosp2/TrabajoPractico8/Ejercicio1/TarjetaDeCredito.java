package trabajospracticosp2.TrabajoPractico8.Ejercicio1;

public class TarjetaDeCredito implements PagoConDescuento, Notificable {
    private String numeroTarjeta;
    private String titular;
    private double saldo;

    public TarjetaDeCredito(String numeroTarjeta, String titular, double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public void procesarPago(double monto) {
        double total = calcularTotal(monto);
        if (saldo >= total) {
            saldo -= total;
            enviarNotificacion("Pago de " + total + " procesado exitosamente.");
        } else {
            enviarNotificacion("Saldo insuficiente para procesar el pago de " + total + ".");
        }
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10; 
        return monto - descuento;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación para " + titular + ": " + mensaje);
    }

    @Override
    public Double calcularTotal(Double monto) {
        return aplicarDescuento(monto);
    }

}
