package trabajospracticosp2.TrabajoPractico7.Ejercicio4;

public class Gato extends Animal {

  public Gato(String nombre) {
    super(nombre, TiposAnimales.GATO);
  }
 
  @Override
  public void hacerSonido() {
    super.hacerSonido();
    System.out.println("Este es un " + super.getTipo() + " y hace: ¡Miau Miau!");
  }
}
