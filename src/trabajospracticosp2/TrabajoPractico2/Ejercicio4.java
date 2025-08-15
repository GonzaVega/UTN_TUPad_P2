/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico2;
import java.util.Scanner;
/**
 *
 * @author GonzaVega
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        double precio, descuento, total;
        char categoria;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio de su producto: ");
        precio = Double.parseDouble(input.nextLine());

        System.out.println("¿Que categoria es? A - B - C");
        categoria = Character.toLowerCase(input.nextLine().charAt(0));
        descuento = 0;
        //Se deja seteado el total igual a precio, para el caso que el usuario ingrese una categoria erronea.
        total = precio;

        switch (categoria) {
          case 'a':
            descuento = 10;
            total = precio * 0.90;
            break;
          case 'b':
            descuento = 15;
            total = precio * 0.85;
            break;
          case 'c':
            descuento = 20;
            total = precio * 0.80;
            break;
          default:
            System.out.println("La categoria es incorrecta.");
            break;
        }

        System.out.println("El descuento aplicado es de: " + descuento + "%.\nEl precio final es de: $" + total + "\nEl precio original era de: $"+ precio + ".");

    }
}
