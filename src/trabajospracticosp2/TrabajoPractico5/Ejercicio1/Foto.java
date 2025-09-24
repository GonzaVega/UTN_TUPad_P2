/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico5.Ejercicio1;

/**
 *
 * @author GonzaVega
 */
public class Foto {
    private String imagen;
    private String formato;
    private Pasaporte pasaporte;

    public Foto(String imagen, String formato, Pasaporte pasaporte) {
        this.imagen = imagen;
        this.formato = formato;
        this.pasaporte = pasaporte;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
            
}
