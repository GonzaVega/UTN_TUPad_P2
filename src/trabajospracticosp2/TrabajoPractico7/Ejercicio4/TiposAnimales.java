package trabajospracticosp2.TrabajoPractico7.Ejercicio4;

public enum TiposAnimales {
  GATO("Son pequeños felinos domésticos"),
  PERRO("Son amigos fieles del hombre"),
  VACA("Son grandes mamíferos rumiantes");

  private String descripcion;

  TiposAnimales(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }
}                 