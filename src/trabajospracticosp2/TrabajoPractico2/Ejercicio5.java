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
public class Ejercicio5 {
    public static void main(String[] args) {
        double numero, acumulado;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para sumar solo los pares, 0 para finalizar: ");
        numero = Double.parseDouble(input.nextLine());
        acumulado = 0;
        
        //Se corrobora si el numero inicial es 0, para darle feedback al usuario.       
        if (numero == 0){
            System.out.println("Ha ingresado 0, finaliza el programa.");
        } else {
            while (numero != 0){
                if (numero % 2 == 0) {
                    acumulado += numero;
                } 
            System.out.println("Ingrese otro numero (0 para terminar): ");
            numero = Double.parseDouble(input.nextLine());
            }
        }
        
        System.out.println("La suma de los numero pares ingresados es: " + acumulado);
    }
        
}
