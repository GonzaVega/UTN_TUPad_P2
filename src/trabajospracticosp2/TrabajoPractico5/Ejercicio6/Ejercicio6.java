/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio6;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jorge", "2966-659577");
        Mesa mesa = new Mesa(4, 8);
        
        LocalDate fecha= LocalDate.of(2025,9,23);
        LocalTime hora= LocalTime.of(21,45);
        Reserva reserva = new Reserva(fecha, hora, mesa);
        
        reserva.setCliente(cliente);
        reserva.getCliente();
        reserva.getMesa();
        
        System.out.println(reserva);
    }
}
