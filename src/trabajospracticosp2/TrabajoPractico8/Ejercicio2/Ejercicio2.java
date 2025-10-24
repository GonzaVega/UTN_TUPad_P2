package trabajospracticosp2.TrabajoPractico8.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    
    // Punto 1.
    Scanner scanner = new Scanner(System.in);
    int a, b;

    System.out.print("Ingrese el primer número: ");
    a = Integer.parseInt(scanner.nextLine());

    System.out.print("Ingrese el segundo número: ");
    b = Integer.parseInt(scanner.nextLine());

    Divisor divisor = new Divisor();
    try {
      int resultado = divisor.dividir(a, b);
      System.out.println("Resultado de la división: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e);
    } 
    // Punto 2.
    String mensaje;
    System.out.println("Ingrese un mensaje: ");
    mensaje = scanner.nextLine();
    try {
      int numero = Integer.parseInt(mensaje);
      System.out.println("Se transformó el mensaje en el número: " + numero);
    } catch (NumberFormatException e) {
      System.out.println("Error: El valor ingresado no es un número entero.");  
    }
    
    // Puntos 3 y 5.
    String ruta1 = "src/trabajospracticosp2/TrabajoPractico8/Ejercicio2/Mensaje en archivo para TP8 P 2.txt";
    LectorArchivo.leerArchivo(ruta1); 
    String ruta2 = "src/trabajospracticosp2/TrabajoPractico8/Ejercicio2/ARCHIVOERRONEO.txt";
    LectorArchivo.leerArchivo(ruta2);

    // Punto 4.
    System.out.println("Ingrese su edad: ");
    int edad = Integer.parseInt(scanner.nextLine());
    try {
      if (edad < 0 || edad > 120) {
        throw new EdadInvalidaException("Edad inválida: " + edad);
      } else {
        System.out.println("Edad ingresada correctamente: " + edad);
      }
    } catch (EdadInvalidaException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
