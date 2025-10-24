package trabajospracticosp2.TrabajoPractico8.Ejercicio1;

public class Producto implements Pagable {
  private String nombre;
  private double precio;

  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public double getPrecio() {
    return precio;
  }

  @Override
  public Double calcularTotal(Double monto) {
    if (precio < 0) {
      throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    System.out.println("El total del producto " + nombre + " es: $" + precio);
    return precio;
  }

}
