/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio5;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String modeloMother = "ROG Strix";
        String chipMother = "I9 pro";
        Propietario propietario = new Propietario("Carlos", 45908765);
        Computadora compu = new Computadora("Asus", "fasdf345", modeloMother, chipMother);
        
        compu.setPropietario(propietario);
        
        System.out.println(compu);
        System.out.println("");
        System.out.println(propietario);
    }
         
    
}
