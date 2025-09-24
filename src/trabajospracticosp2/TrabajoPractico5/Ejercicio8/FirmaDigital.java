/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio8;
import java.time.LocalDate;

/**
 *
 * @author GonzaVega
 */
public class FirmaDigital {
    private String hashCode;
    private LocalDate fecha;
    private Usuario usuario; 
    
    public FirmaDigital(String hashCode, LocalDate fecha, Usuario usuario) {
        this.hashCode = hashCode;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public void mostrarUsuario(){
        if (usuario != null) {
            System.out.println("El usuario de la firma es: " + usuario.getNombre() + ", tiene el email: " + usuario.getEmail());
        }
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + ", hashCode=" + hashCode + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
}
