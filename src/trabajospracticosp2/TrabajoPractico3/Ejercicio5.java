/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3;

import trabajospracticosp2.TrabajoPractico3.clases.NaveEspacial;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio5 {
    public static void main(String[] args) {
    NaveEspacial naveInsignia = new NaveEspacial();

    naveInsignia.setNombre("La Poderosa");

    naveInsignia.mostrarEstado();

    naveInsignia.avanzar(35);

    naveInsignia.recargarCombustible(50);

    naveInsignia.despegar();

    naveInsignia.avanzar(10);

    naveInsignia.mostrarEstado();

  }

}
