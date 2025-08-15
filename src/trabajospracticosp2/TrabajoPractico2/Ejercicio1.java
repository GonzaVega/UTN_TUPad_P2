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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.println("Ingrese un anio para saber si es bisiesto: ");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0)|| anio % 400 == 0) {
            System.out.println("El anio es bisiesto");
        } else {
            System.out.println("El anio NO es bisiesto");
        }
        
    }
         
}
