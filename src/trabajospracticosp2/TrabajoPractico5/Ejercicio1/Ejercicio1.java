/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio1;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("2345234562", "25/06/2020", "Imagen de frente", ".jpg");
        Titular titular = new Titular("Juan Carlos", 34908675);
        
        pasaporte.setTitular(titular);
        
        System.out.println(pasaporte);
        System.out.println("");
        System.out.println(titular);
    }
}
