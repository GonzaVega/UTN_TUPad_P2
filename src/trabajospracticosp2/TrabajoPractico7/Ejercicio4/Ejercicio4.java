package trabajospracticosp2.TrabajoPractico7.Ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
  public static void main(String[] args) {
    ArrayList<Animal> animales = new ArrayList<Animal>();

    animales.add(new Perro("Firulais"));
    animales.add(new Gato("Michi"));
    animales.add(new Vaca("Lola"));
    for (Animal animal : animales) {
      animal.hacerSonido();
      animal.describir();
      System.out.println();
    }
  }
}
