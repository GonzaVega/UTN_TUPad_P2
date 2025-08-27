/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3.clases;

/**
 *
 * @author GonzaVega
 */
public class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;

    public void mostrarInfo() {
      System.out.println(this.nombre + " " + this.apellido + " " + this.curso + " " + this.calificacion);
    }

    public double subirCalificacion(double nota) {
      if (nota >= 0) {
        this.calificacion += nota;
      }
      return this.calificacion;
    }

    public double bajarCalificacion(double nota){
      if (nota >= 0) {
        this.calificacion -= nota;
      }
      return this.calificacion;
    }
}
