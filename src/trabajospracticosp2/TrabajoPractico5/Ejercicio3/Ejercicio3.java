/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio3;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Super Libros", "Falsa 123");
        Libro libro = new Libro("Clean Code", "sdafsdaf4435", editorial);
        Autor autor = new Autor("Robert C. Martin", "Estadounidense");
        
        libro.setAutor(autor);
        
        System.out.println(libro);
    }
    
}
