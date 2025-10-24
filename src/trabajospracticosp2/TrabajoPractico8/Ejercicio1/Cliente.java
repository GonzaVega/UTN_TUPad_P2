package trabajospracticosp2.TrabajoPractico8.Ejercicio1;

public class Cliente implements Notificable {
  private String nombre;
  private String email;

  public Cliente(String nombre, String email) {
    this.nombre = nombre;
    this.email = email;
  }

  @Override
  public void enviarNotificacion(String mensaje) {
    System.out.println("Enviando notificación a " + email + ": " + mensaje);
  }

}
