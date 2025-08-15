/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico2;


/**
 *
 * @author GonzaVega
 */
public class Ejercicio13 {
     public static void impresorRecursivo(double[] numeros, int indice){
       if (indice == 0) {
          System.out.println("Precio: $ " + numeros[indice]);
       } else {
           impresorRecursivo(numeros, (indice - 1));
           System.out.println("Precio: $ " + numeros[indice]);
           if (indice == 2){
               numeros[indice] = 129.99;
           }
           
       }
    }
    
    public static void main(String[] args) {
        double [] precios ={199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios Originales: ");
        
        impresorRecursivo(precios, precios.length - 1);
        
        System.out.println("Precios modificados: ");
        
        // No entendi si habia que crear otra funcion distinta para el segundo caso, si es asi, lo corregire.
        impresorRecursivo(precios, precios.length - 1);
    }
}
