package trabajospracticosp2.TrabajoPractico7.Ejercicio4;

public class Vaca extends Animal  {
  
  public Vaca(String nombre) {
    super(nombre, TiposAnimales.VACA);
  }

  @Override
  public void hacerSonido() {
    super.hacerSonido();
    System.out.println("Esta es una " + super.getTipo() + " y hace: ¡Muu Muu!");
  }
}
