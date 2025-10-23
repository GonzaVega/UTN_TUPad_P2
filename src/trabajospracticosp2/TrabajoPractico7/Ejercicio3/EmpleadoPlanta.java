package trabajospracticosp2.TrabajoPractico7.Ejercicio3;

public class EmpleadoPlanta extends Empleado {
  private double salarioMensual;

  public EmpleadoPlanta(String nombre, String apellido, String dni, double salarioMensual) {
    super(nombre, apellido, dni);
    this.salarioMensual = salarioMensual;
  }

  @Override
  public double calcularSalario() {
    if (salarioMensual < 0) {
      return 0; 
    }
    return salarioMensual;
  }
}
