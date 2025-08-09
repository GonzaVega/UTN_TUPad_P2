/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico1;

import java.util.Scanner;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); System.out.print("Ingresa tu nombre: "); 
        // String nombre = scanner.nextInt(); // ERROR 
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

    }
}
