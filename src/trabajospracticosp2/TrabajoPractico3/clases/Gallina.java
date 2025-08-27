/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3.clases;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author GonzaVega
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    private static Set<Integer> idsUsados = new HashSet<>();

    public void mostrarEstado() {
      System.out.println(this.idGallina + " " + this.edad + " " + this.huevosPuestos);
    }

    public void setIdGallina(int id) {
      if (!idsUsados.contains(id))
      this.idGallina = id;
    }

    public void setEdad(int tiempo) {
      if (tiempo >= 0) {
        this.edad = tiempo;
      }
    }

    public void ponerHuevos(){
      this.huevosPuestos ++;
    }

    public void envejecer(){
      this.edad ++;
    }

}
