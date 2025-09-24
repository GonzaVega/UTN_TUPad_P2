/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio6;

/**
 *
 * @author GonzaVega
 */
public class Cliente {
    private String nombre;
    private String telefono;
    
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString() {
        return ", Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
}
