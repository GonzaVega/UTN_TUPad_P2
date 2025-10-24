package trabajospracticosp2.TrabajoPractico8.Ejercicio1;

public enum EstadoPedido {
  PENDIENTE("Pedido pendiente de confirmación"),
  CONFIRMADO("Pedido confirmado"),
  EN_PROCESO("Pedido en proceso de preparación"),
  ENVIADO("Pedido enviado"),
  ENTREGADO("Pedido entregado"),
  CANCELADO("Pedido cancelado");

  private String descripcion;

  EstadoPedido(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }
}
