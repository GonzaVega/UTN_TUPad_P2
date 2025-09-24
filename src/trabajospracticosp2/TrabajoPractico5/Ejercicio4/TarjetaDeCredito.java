/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio4;

/**
 *
 * @author GonzaVega
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco; 
    private Cliente cliente; 
    
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
    this.numero = numero;
    this.fechaVencimiento = fechaVencimiento;
    this.banco = banco;
    }
    
    public void getBanco(){
        if (banco != null) {
            System.out.println("La tarjeta de credito " + numero + " corresponde al banco " + banco.getNombre());
        }
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
           cliente.setTarjetaDeCredito(this);
        }
    }
}
