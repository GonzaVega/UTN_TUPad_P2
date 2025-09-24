/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio2;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("ASUS", "4000 mAH");
        Usuario usuario = new Usuario("Pedro", "34869587");
        Celular celular = new Celular("123456", "Samsung", "S24", bateria);

        celular.getBateria();

        celular.setUsuario(usuario);
        System.out.println("El usuario " + usuario.getNombre() + " tiene el DNI " + usuario.getDni());
        System.out.println("El celular " + celular.getMarca() + " es el modelo " + celular.getModelo());
        System.out.println("usuario asociado al celular: " + celular.getUsuario().getNombre());
        System.out.println("celular asociado al usuario: " + usuario.getCelular().getMarca());
    }
}
