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
public class Ejercicio5 {
    public static void main(String[] args) {
        Double num1, num2, suma, resta, multi, division;
        Scanner input = new Scanner(System.in);
    
        System.out.println("Ingrese el primer número: ");
        num1 = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el segundo número: ");
        num2 = Double.parseDouble(input.nextLine());

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        division = num1 / num2;

        System.out.println("Las operaciones resultantes de los números ingresados son: \n Suma: " + suma + "\n Resta: " 
                            + resta + "\n Multiplicación: " + multi + "\n División: " + division);

    }
}
