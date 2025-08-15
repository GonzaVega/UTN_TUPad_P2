/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico2;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio12 {
    
    public static void impresor(double[] numeros){
        for (double numero : numeros) {
            System.out.println("Precio: $" + numero);
        }
    }
    
    public static void main(String[] args) {
        double [] precios ={199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios Originales: ");
        
        impresor(precios);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        
        impresor(precios);
    }
}
