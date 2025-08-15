/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico2;

import java.util.Scanner;
/**
 *
 * @author GonzaVega
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int nota;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            
            System.out.println("Error. Nota invalida. Ingrese una nota entre 0 y 10.");
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");

    }
    
}
