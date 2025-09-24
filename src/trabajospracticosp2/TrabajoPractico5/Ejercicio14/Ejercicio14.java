/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio14;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto(" Video Dependecia de Creacion", 5);
        Render render = new Render("mp4", proyecto);
        
        EditorVideo.exportar(render.getFormato(), render.getProyecto());
        
    }
}
