package trabajospracticosp2.TrabajoPractico8.Ejercicio1;

public class PayPal implements Pago, Notificable {
  private String email;
  private double saldo;

  public PayPal(String email, double saldo) {
    this.email = email;
    this.saldo = saldo;
  }

  @Override
  public void procesarPago(double monto) {
    double total = calcularTotal(monto);
      if (saldo >= total) {
        saldo -= total;
        enviarNotificacion("Pago de $" + total + " procesado exitosamente vía PayPal.");
      } else {
        enviarNotificacion("Saldo insuficiente en PayPal para procesar el pago de $" + total);
      }
    }

  @Override
  public Double calcularTotal(Double monto) {
    return monto;
  }

  @Override
  public void enviarNotificacion(String mensaje) {
    System.out.println("Notificación PayPal a " + email + ": " + mensaje);
    }
}
