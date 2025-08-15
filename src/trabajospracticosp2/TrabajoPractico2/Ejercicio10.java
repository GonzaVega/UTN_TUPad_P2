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
public class Ejercicio10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;        
    }
    public static void main(String[] args) {
        int stock, ventas, ingresos;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el stock actual: ");
        stock = Integer.parseInt(input.nextLine());
            
        System.out.println("Ingrese las ventas realizadas: ");
        ventas = Integer.parseInt(input.nextLine());
            
        System.out.println("Ingrese las reposiciones ingresadas: ");
        ingresos = Integer.parseInt(input.nextLine());
        
        stock = actualizarStock(stock, ventas, ingresos);
        
        System.out.println("El nuevo stock del producto es: " + stock);
        
    }
    
}
