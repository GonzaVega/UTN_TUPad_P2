/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3;

import trabajospracticosp2.TrabajoPractico3.clases.Gallina;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio4 {
    public static void main(String[] args) {
    Gallina turuleca = new Gallina();
    Gallina hermenegilda = new Gallina();

    turuleca.mostrarEstado();
    hermenegilda.mostrarEstado();

    turuleca.setIdGallina(1);
    turuleca.setEdad(3);
    
    hermenegilda.setIdGallina(1);
    hermenegilda.mostrarEstado();
    hermenegilda.setIdGallina(2);
    hermenegilda.mostrarEstado();
    hermenegilda.setEdad(1);

    turuleca.mostrarEstado();
    hermenegilda.mostrarEstado();

    turuleca.ponerHuevos();
    turuleca.ponerHuevos();

    hermenegilda.envejecer();
    hermenegilda.envejecer();

    turuleca.mostrarEstado();
    hermenegilda.mostrarEstado();
  }

}
