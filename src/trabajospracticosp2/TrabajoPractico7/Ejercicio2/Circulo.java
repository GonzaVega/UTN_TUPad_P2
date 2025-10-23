package trabajospracticosp2.TrabajoPractico7.Ejercicio2;

public  class Circulo extends Figura {
  private double radio;

  public Circulo(String nombre, double radio) {
    super(nombre);
    this.radio = radio;
  }

  @Override
  public String getNombre() {
    return super.getNombre();
  }

  @Override
  public double calcularArea() {
    if (radio < 0) {
      return 0; 
    }
    return Math.PI * Math.pow(radio, 2);
  }
}
