/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3.clases;

/**
 *
 * @author GonzaVega
 */
public class Mascota {
    public String nombre;
    public String especie;
    public double edad;

    public void mostrarInfo() {
      System.out.println(this.nombre + " " + this.especie + " " + this.edad);
    }

    public double cumplirAnios() {
      return this.edad ++;
    }
}
