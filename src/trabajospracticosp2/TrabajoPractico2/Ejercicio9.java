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
public class Ejercicio9 {
    //Funciones
    public static double calcularCostoEnvio(double peso, String tipoEnvio) {
         if (tipoEnvio.equals("nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        } 
    }
    // Como el enunciado pide que usemos a calcularCostoEnvio dentro de calcularTotalCompra, los argumentos propuestos para el segundo metodo son insuficientes, para realizarlo fuera del 
    // main,entonces se llamara en main a calcularTotalCompra y se le pasara como argumentos el precio del producto y la funcion calcularCostoEnvio.
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, peso;
        String zonaEnvio;
        
        System.out.println("Ingrese precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
            
        System.out.println("Ingrese el peso en kg: ");
        peso = Double.parseDouble(input.nextLine());
            
        do {
            System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
            zonaEnvio = input.nextLine().toLowerCase();
            if ((zonaEnvio.equals("nacional") || zonaEnvio.equals("internacional"))) {
            precio = calcularTotalCompra(precio, calcularCostoEnvio(peso, zonaEnvio));
            System.out.println("El costo de envio es: " + calcularCostoEnvio(peso, zonaEnvio) + "\nEl total a pagar es: " + precio);
            } else {
            System.out.println("Ingreso una zona de envio incorrecta, intente de nuevo.");
            zonaEnvio = input.nextLine().toLowerCase();
            }      
        } while (!(zonaEnvio.equals("nacional") || zonaEnvio.equals("internacional")));
    }

}
