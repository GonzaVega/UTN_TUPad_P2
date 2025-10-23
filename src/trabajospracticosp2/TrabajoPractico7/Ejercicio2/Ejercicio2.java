package trabajospracticosp2.TrabajoPractico7.Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args) {
    ArrayList<Figura> figuras = new ArrayList<>();
    figuras.add(new Circulo("Circulo A",5));
    figuras.add(new Circulo("Circulo B", 3.2));
    figuras.add(new Rectangulo("Rectangulo A", 4, 6));
    figuras.add(new Rectangulo("Rectangulo B", 4.5, 2.3));

    for (Figura figura : figuras) {
      System.out.println("Calculando sobre: " + figura.getNombre() + " - Área: " + figura.calcularArea());
    }
  }
}
