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
public class Ejercicio4 {
     public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad + " años.");

    }
}
