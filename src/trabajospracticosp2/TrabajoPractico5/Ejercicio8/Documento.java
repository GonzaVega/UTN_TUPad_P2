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

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; 
    
    
    public Documento(String titulo, String contenido, String hashCode, LocalDate fecha, Usuario usuario){
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(hashCode, fecha, usuario);
    }
    
    public void mostrarFirma(){
        System.out.println("El documento " + titulo + " tiene la firma " + firmaDigital);
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
}
