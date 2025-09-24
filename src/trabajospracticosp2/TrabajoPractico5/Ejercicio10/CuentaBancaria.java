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
public class CuentaBancaria {
   private String cbu;
    private double saldo;
    private ClaveSeguridad clave; 
    private Titular titular;      

    public CuentaBancaria(String cbu, double saldo, String codigo, LocalDate ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public Titular getTitular() {
        return titular; 
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria()!= this) {
            titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo +
               ", clave=" + clave +
               ", titular=" + (titular != null ? titular.getNombre() : "sin titular") + "}";
    }
}
