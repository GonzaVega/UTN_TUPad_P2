/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico3.clases;

/**
 *
 * @author GonzaVega
 */
public class NaveEspacial {
    private String nombre;
  private int combustible;
  
  public void mostrarEstado() {
    System.out.println(this.nombre + " " + this.combustible);
  }
 
  public void setNombre(String name) {
    if (name != "") {
      this.nombre = name;
    }
  }

  public void recargarCombustible(int unidades) {
    if (unidades > 0 && (unidades + this.combustible) <= 50) {
      this.combustible += unidades;
    } else if ((unidades + this.combustible) > 50){
      int sobrante = unidades + this.combustible;
      this.combustible = 50;
      sobrante = sobrante - this.combustible;
      System.out.println("Limite de carga excedido, se reservan para su retorno " + sobrante + "unidades de combustible en base espacial.");
    }
  }
  
  public void despegar() {
    if (this.combustible >= 30){
      System.out.println("10 \n9\nSecuencia de ignicion iniciada...\n8\n7\n6\n5\n4\nMotores encendidos\n3\n2\n1\nAscenso positivo\nDespegue Exitoso!!!");
      this.combustible -= 25;
    } else {
      System.out.println("Recargar combustible, al menos 30 unidades necesarias pra despegar.\nCombustible actual: " + this.combustible);
    }
  }

  public void avanzar(int distancia){
    if (this.combustible >= distancia && distancia > 0) {
      System.out.println("Nave ok\nTripulacion ok \nComienza el viaje");
      this.combustible -= distancia;
    } else {
      System.out.println("Combustible insuficiente para la distancia ingresada.");
    }
  }

}
