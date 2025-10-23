package trabajospracticosp2.TrabajoPractico7.Ejercicio4;

public class Animal {
  String nombre;
  TiposAnimales tipo;
  
  public Animal(String nombre, TiposAnimales tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
  }
  
  public void hacerSonido() {
    System.out.println("El animal hace un sonido");
  }

  public TiposAnimales getTipo() {
    return tipo;
  }

  public void describir() {
    switch (tipo) {
      case GATO:
        System.out.println("Este es un " + getTipo() + ".");
        System.out.println("Los gatos " + tipo.getDescripcion());
        break;
      case PERRO:
        System.out.println("Este es " + getTipo() + ".");
        System.out.println("Los perros " + tipo.getDescripcion());
        break;
      case VACA:
        System.out.println("Este es una " + getTipo() + ".");
        System.out.println("Las vacas " + tipo.getDescripcion());
        break;
      default:
        System.out.println("Este es un animal desconocido.");
        break;
    }
    System.out.println("Se llama: " + nombre);
  } 
}
