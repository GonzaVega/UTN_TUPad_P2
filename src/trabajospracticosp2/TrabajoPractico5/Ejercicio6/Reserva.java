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
public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente; 
    private Mesa mesa; 
    
    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa){
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public void setCliente(Cliente cliente){
        if (cliente != null) {
            this.cliente = cliente;
        }
    }
    
    public void getCliente(){
        if (cliente != null) {
            System.out.println("El cliente "+ cliente.getNombre()+ " tiene una reserva el dia " + fecha + " a la hora " + hora);
        } else {
            System.out.println("no existen reservas a nombre de " + cliente.getNombre());
        }
    }
    
    public void getMesa(){ 
        if (mesa != null) {
            System.out.println("La reserva tiene la mesa " + mesa.getNumero() + " con capacidad para " + mesa.getCapacidad());
        } else {
            System.out.println("La reserva no tiene ninguna mesa asignada");
        }
    }  

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + cliente +  mesa + '}';
    }
}
