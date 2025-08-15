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
public class Ejercicio11 {
    static double DESCUENTO = 0.10;
    
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = (precio - (precio * DESCUENTO));
        return descuentoAplicado;
    }
    
    public static void main(String[] args) {
        double precioProducto, precioDescontado;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio de su producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        precioDescontado = calcularDescuentoEspecial(precioProducto);
               
        System.out.println("El descuento especial aplicado es: " +  (precioProducto - precioDescontado) + "\nEl precio final con descuento es: " + precioDescontado);
    }
    
}
