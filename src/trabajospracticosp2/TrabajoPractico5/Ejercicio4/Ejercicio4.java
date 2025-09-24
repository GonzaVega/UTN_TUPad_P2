/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio4;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco = new Banco("Bco. Nacion", "37-435-345");
        Cliente cliente = new Cliente("Pedro", "37412345");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("9804532980345", "12-30", banco);
        
        tarjeta.getBanco();
        
        tarjeta.setCliente(cliente);
        System.out.println("El cliente " + cliente.getNombre() );
        System.out.println("La tarjeta " + tarjeta.getNumero());
        System.out.println("El cliente asociado a la tarjeta " +  tarjeta.getCliente().getNombre() + " con fecha de vencimiento: " + tarjeta.getFechaVencimiento());
    
    }
}
