package trabajospracticosp2.TrabajoPractico8.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LectorArchivo {
  public static void leerArchivo(String ruta) {
    if (ruta == null || ruta.isBlank()) {
      System.out.println("Ruta inválida: no puede ser nula ni vacía.");
      return;
    }

    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(ruta), StandardCharsets.UTF_8))) {
      String linea;
      while ((linea = br.readLine()) != null) {
        System.out.println(linea);
      }
    } catch (FileNotFoundException e ) {
      System.out.println("Archivo no encontrado: " + ruta);
    } catch (IOException e) {
      System.out.println("Error de E/S al leer " + ruta + ": " + e.getMessage());
    }
  }
}
