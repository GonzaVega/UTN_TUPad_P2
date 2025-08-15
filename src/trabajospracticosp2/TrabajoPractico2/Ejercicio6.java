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
public class Ejercicio6 {
    public static void main(String[] args) {
        int numero, countPos, countNeg, count0;
        Scanner input = new Scanner(System.in);
        countPos = 0;
        countNeg = 0;
        count0 = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese 10 numeros, contaremos cuantos son positivos, negativos o cero, numero " + (i + 1) + " de 10: ");
            numero = Integer.parseInt(input.nextLine());
            
            if (numero > 0) {
                countPos += 1;
            } else if (numero < 0){
                countNeg += 1;
            } else {
                count0 += 1;
            }
        }
        
        System.out.println("Resultados: \nPositivos: " + countPos + "\nNegativos: " + countNeg + "\nCeros: " + count0);
    }
}
