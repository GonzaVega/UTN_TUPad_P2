package trabajospracticosp2.TrabajoPractico7.Ejercicio4;

public class Perro extends Animal  {
 
  public Perro(String nombre) {
    super(nombre, TiposAnimales.PERRO);
  }

  @Override
  public void hacerSonido() {
    super.hacerSonido();
    System.out.println("Este es un " + super.getTipo() + " y hace: ¡Guau Guau!");
  }
}
