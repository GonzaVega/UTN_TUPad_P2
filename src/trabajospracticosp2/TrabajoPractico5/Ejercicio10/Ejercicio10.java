/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio10;
import java.time.LocalDate;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Titular titular = new Titular("Rogelio", "34895012");
        CuentaBancaria cuenta = new CuentaBancaria("3q4523452345234", 150000.0, "3453", LocalDate.now());

        cuenta.setTitular(titular);

        System.out.println(cuenta);
        System.out.println(titular);
       
    }
}
