/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3.clases;

import java.time.Year;
/**
 *
 * @author GonzaVega
 */
public class Libro {
   private String titulo;
    private String autor;
    private int anioPublicacion;

    public void mostrarInfo() {
      System.out.println(this.titulo + " " + this.autor + " " + this.anioPublicacion);
    }

    public void setTitulo(String title) {
      this.titulo = title;
    }

    public void setAutor(String aut) {
      this.autor = aut;
    }

    public void setAnioPublicacion(int a) {
      int anioActual = Year.now().getValue();
      if (a != 0 && a <= anioActual ) {
        this.anioPublicacion = a;
      }
    }

    public String getTitulo(){
      return this.titulo;
    }

    public String getAutor(){
      return this.autor;
    }

    public int getAnioPublicacion(){
      return this.anioPublicacion;
    }


}
