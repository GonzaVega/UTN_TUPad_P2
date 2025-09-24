/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio10;

/**
 *
 * @author GonzaVega
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;
    
    public Titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public CuentaBancaria getCuentaBancaria(){
        return cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria =  cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria + '}';
    }
}
