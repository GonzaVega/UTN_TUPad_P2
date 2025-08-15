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
public class Ejercicio3 {
    public static void main(String[] args) {
        int edad;
        String etapa;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12){
            etapa = "Nino";
        } else if (edad >= 12 && edad <= 17) {
            etapa = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapa = "Adulto";
        } else {
            etapa = "Adulto mayor";
        }
        
        System.out.println("Eres un: " + etapa);
               
        
    }
}
