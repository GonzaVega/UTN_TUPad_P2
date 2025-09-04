/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico4;

/**
 *
 * @author GonzaVega
 */

import java.util.HashSet;
import java.util.Set;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    private static Set<Integer> idsUsados = new HashSet<>();

    // Aca creo que habria que asignar los atributos de las instancias con setters, validando los datos en esos metodos, pero se hace de la siguiente manera para cumplir con la consigna 1 que nos obliga a usar en constructores la palabra "this".
    public Empleado(int id, String nombre, String puesto, double salario){
      //Esta validacion es para que no se vayan a repetir los id, tendra sentido al ver el proximo constructor. No es infalible, deberia ser mejor, pero se introduce una aproximacian para que el docente tenga nocion que se tiene presente la unicidad de los valores, teniendo en cuenta conceptos aprendidos en las demas materias del curso (Bases de Datos 1)
      if (idsUsados.contains(id)) {
        this.id = totalEmpleados + 1;
        idsUsados.add(this.id);
        System.out.println("El id ingresado ya ha sido tomado, se genera uno alternativo");
      } else {
          this.id = id;
          idsUsados.add(id);
      }

      if (nombre != null){
        this.nombre = nombre;  
      }
      if (puesto != null){
        this.puesto = puesto;  
      }

      this.salario = salario;
      totalEmpleados ++;
    }

    public Empleado(String nombre, String puesto){
      this(totalEmpleados + 1, nombre, puesto, 1000);
    }

    public static int mostrarTotalEmpleados(){
      return totalEmpleados;
    }

    public double actualizarSalario(double porcentajeAumento){
      if (porcentajeAumento > 0){
        this.salario = this.salario + (this.salario * porcentajeAumento / 100);
      }
      return this.salario;
    }

    public double actualizarSalario(){
      return actualizarSalario(10);
    }

    @Override
    public String toString(){
      return ("id = " + id + " Nombre = " + nombre + " Puesto = " + puesto + " Salario = " + salario);
    }
}
