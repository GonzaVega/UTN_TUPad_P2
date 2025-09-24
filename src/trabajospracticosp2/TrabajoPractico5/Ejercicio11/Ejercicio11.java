/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio11;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio11 {
    public static void main(String[] args) {
      Artista bach = new Artista("J.S. Bach", "Clasica");
      
      Cancion laPrimavera = new Cancion("La Primavera", bach);
      
      Reproductor.reproducir(laPrimavera);
    }    
    
}
