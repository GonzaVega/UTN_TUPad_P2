package trabajospracticosp2.TrabajoPractico7.Ejercicio3;

public class EmpleadoTemporal extends Empleado {
  private double salarioPorHora;
  private int horasTrabajadas;

  public EmpleadoTemporal(String nombre, String apellido, String dni, double salarioPorHora, int horasTrabajadas) {
    super(nombre, apellido, dni);
    this.salarioPorHora = salarioPorHora;
    this.horasTrabajadas = horasTrabajadas;
  }

  @Override
  public double calcularSalario() {
    if (salarioPorHora < 0 || horasTrabajadas < 0) {
      return 0; 
    }
    return salarioPorHora * horasTrabajadas;
  }
}
