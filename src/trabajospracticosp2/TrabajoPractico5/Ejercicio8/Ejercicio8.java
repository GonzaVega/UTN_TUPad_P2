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
public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "juan@perez.com");
        String hashFirma = "has234513";
        LocalDate fechaFirma = LocalDate.now();
        Documento doc = new Documento("Proyecto", "'Mejora de procesos'", hashFirma , fechaFirma, usuario);
        
        doc.mostrarFirma();
        System.out.println("");
        doc.getFirmaDigital().mostrarUsuario();
    }   
}
