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
public class Ejercicio8 {
    //Funciones
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioInicial) {
       return  precioInicial * (1 + ((impuesto - descuento) / 100));
    }
    public static void main(String[] args) {
        double precioBase, cantImpuesto, descuentoProd, precioFinal;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese precio del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
            
        System.out.println("Ingrese el impuesto en porcentaje: ");
        cantImpuesto = Double.parseDouble(input.nextLine());
            
        System.out.println("Ingrese el descuento en porcentaje: ");
        descuentoProd = Double.parseDouble(input.nextLine());
        
        precioFinal = calcularPrecioFinal(cantImpuesto, descuentoProd, precioBase);
        
        
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }
    
}
