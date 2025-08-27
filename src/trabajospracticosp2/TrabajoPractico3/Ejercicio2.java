/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3;

import trabajospracticosp2.TrabajoPractico3.clases.Mascota;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    Mascota mascota = new Mascota();
    mascota.nombre = "Boby";
    mascota.especie = "Perro";
    mascota.edad = 2;
    
    mascota.mostrarInfo();
    mascota.cumplirAnios();
    mascota.mostrarInfo();
  }

}
