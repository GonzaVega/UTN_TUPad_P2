/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio7;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Motor motor = new Motor("Naftero", "fsadfs345643");
        Vehiculo vehiculo = new Vehiculo("FGH234", "DB9", motor);
        Conductor conductor = new Conductor("Carlos", "234567");
        
        vehiculo.setConductor(conductor);
        
        System.out.println(vehiculo);
        System.out.println("");
        System.out.println(conductor);
    }
    
}
