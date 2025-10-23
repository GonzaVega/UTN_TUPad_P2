package trabajospracticosp2.TrabajoPractico7.Ejercicio2;

public class Rectangulo extends Figura {
  private double ancho;
  private double alto;

  public Rectangulo(String nombre,double ancho, double alto) {
    super(nombre);
    this.ancho = ancho;
    this.alto = alto;
  }

  @Override
  public String getNombre() {
    return super.getNombre();
  }

  @Override
  public double calcularArea() {
    if (ancho < 0 || alto< 0) {
      return 0; 
    }
    return ancho * alto;
  }
}
