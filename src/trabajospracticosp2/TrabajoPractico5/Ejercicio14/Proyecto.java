/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio14;

/**
 *
 * @author GonzaVega
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;
    
    public Proyecto(String nombre, int duracionMin){
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
}
