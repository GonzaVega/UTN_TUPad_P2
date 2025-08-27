/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3;

import trabajospracticosp2.TrabajoPractico3.clases.Libro;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio3 {
    public static void main(String[] args) {
    Libro nuevoLibro = new Libro();
    nuevoLibro.setTitulo("Java lessons");
    nuevoLibro.setAutor("Juan Carlos Programati");
    nuevoLibro.setAnioPublicacion(2045);
    nuevoLibro.mostrarInfo();
    nuevoLibro.setAnioPublicacion(1993);
    nuevoLibro.mostrarInfo();
  }
}
