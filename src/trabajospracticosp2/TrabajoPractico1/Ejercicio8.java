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
public class Ejercicio8 {
    public static void main(String[] args) {
        int num1, num2, divisionInt;
        double divisionDouble;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        divisionInt = num1 / num2;
        divisionDouble = (double) num1 / num2;
        
        System.out.println("El resultado de sus divisiones es:\nIntegers: " + divisionInt + "\nDoubles: " + divisionDouble);
    }
}
