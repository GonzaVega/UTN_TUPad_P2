/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3;

import trabajospracticosp2.TrabajoPractico3.clases.Estudiante;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    Estudiante est = new Estudiante();
    est.nombre = "Gilfracio";
    est.apellido = "Gomez";
    est.curso = "1B";
    
    est.mostrarInfo();
    est.subirCalificacion(10);
    est.bajarCalificacion(4);
    est.mostrarInfo();
  }

}
