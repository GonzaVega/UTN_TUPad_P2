/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico4;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio {
    public static void main(String[] args) {
       Empleado administracion1 = new Empleado(1, "Juan", "Clasificador", 20000);
       Empleado administracion2 = new Empleado("Carlos", "Encargado");

       System.out.println(administracion1);
       System.out.println(administracion2);

       administracion1.actualizarSalario(15);
       administracion2.actualizarSalario();

       System.out.println(administracion1);
       System.out.println(administracion2);

       Empleado.mostrarTotalEmpleados();
    }
}
