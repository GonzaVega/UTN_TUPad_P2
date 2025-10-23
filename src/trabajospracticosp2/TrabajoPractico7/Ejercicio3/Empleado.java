package trabajospracticosp2.TrabajoPractico7.Ejercicio3;

public abstract class Empleado {
  private String nombre;
  private String apellido;
  private String dni;

  public Empleado(String nombre, String apellido, String dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  public abstract double calcularSalario();
}
