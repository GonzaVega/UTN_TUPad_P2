/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio9;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        CitaMedica cita1 = new CitaMedica("19 de septiembre", "13:00hs");
        Paciente paciente1 = new Paciente("Juan Carlos", "OSDE");
        Profesional profesional1 = new Profesional("Pepe Gonzalez", "Cardiologo");
        CitaMedica cita2 = new CitaMedica("19 de septiembre", "13:00hs", paciente1, profesional1);
        
        System.out.println(cita1);
        System.out.println("");
        System.out.println(cita2);
    }
}
