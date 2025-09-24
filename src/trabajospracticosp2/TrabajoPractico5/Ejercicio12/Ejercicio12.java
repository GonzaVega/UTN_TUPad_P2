/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio12;

import trabajospracticosp2.TrabajoPractico5.Ejercicio2.*;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan", "20-45634566-09");
        Impuesto impuesto = new Impuesto(1200, contribuyente);
                
        Calculadora.calcular(impuesto);
    }
}
