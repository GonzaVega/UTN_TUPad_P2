package trabajospracticosp2.TrabajoPractico7.Ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
  public static void main(String[] args) {
    ArrayList<Empleado> empleados = new ArrayList<Empleado>( );
    int empleadosPlanta = 0;
    int empleadosTemporales = 0;
    int salariosPlanta = 0;
    int salariosTemporales = 0;

    empleados.add(new EmpleadoPlanta("Juan", "Perez", "12345678", 50000));
    empleados.add(new EmpleadoTemporal("Ana", "Gomez", "87654321", 200, 120));  
    empleados.add(new EmpleadoPlanta("Luis", "Martinez", "11223344", 60000));
    empleados.add(new EmpleadoTemporal("Maria", "Lopez", "44332211", 250, 100));
    empleados.add(new EmpleadoTemporal("Carlos", "Sanchez", "55667788", 180, 150));
    
    for (Empleado empleado : empleados) {
      if (empleado instanceof EmpleadoPlanta) {
        empleadosPlanta++;
        salariosPlanta += empleado.calcularSalario();
      } else if (empleado instanceof EmpleadoTemporal) {
        empleadosTemporales++;
        salariosTemporales += empleado.calcularSalario();
      }
    }
    System.out.println("En esta empresa hay un total de " + empleados.size() + " empleados.");
    System.out.println("Cantidad de empleados de planta: " + empleadosPlanta);
    System.out.println("Cantidad de empleados temporales: " + empleadosTemporales);
    System.out.println("Total salarios empleados de planta: $" + salariosPlanta);
    System.out.println("Total salarios empleados temporales: $" + salariosTemporales);
  }
}
