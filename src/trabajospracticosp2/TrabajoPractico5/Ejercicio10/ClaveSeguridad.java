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
public class ClaveSeguridad {
   private String codigo;
    private LocalDate ultimaModificacion;

    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{codigo='" + codigo + "', ultimaModificacion=" + ultimaModificacion + "}";
    } 
}
