/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio13;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        String valor = "$ 10";
        String usuario = "Tito Gonzalez";
        String email = "tito@gonzalez.com";
        
        GeneradorQR.generar(valor, usuario, email);
    }
    
}
