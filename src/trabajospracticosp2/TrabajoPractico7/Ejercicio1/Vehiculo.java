package trabajospracticosp2.TrabajoPractico7.Ejercicio1;

public class Vehiculo {
  private String marca;
  private String modelo;
  
  public Vehiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public void mostrarInfo() {
    System.out.println("Marca: " + marca + ", Modelo: " + modelo);
  }
}
