/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio12;

/**
 *
 * @author GonzaVega
 */
public class Calculadora {
     static final double IMPUESTO = 1.21;
    
    public static void calcular(Impuesto impuesto){
        double total = impuesto.getMonto() * IMPUESTO;
        System.out.println("El contribuyente " + impuesto.getContribuyente().getNombre() + " debe pagar: " + total );
    }
}
