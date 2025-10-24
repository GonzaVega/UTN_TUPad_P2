package trabajospracticosp2.TrabajoPractico8.Ejercicio1;

import java.util.ArrayList;

public class Pedido implements Pagable {
  private ArrayList<Producto> productos;
  private EstadoPedido estado;
  private Cliente cliente;


  public Pedido() {
    this.productos = new ArrayList<>();
    this.estado = EstadoPedido.PENDIENTE;
    
  }

  public void setCliente(Cliente cliente) {
    if (cliente == null) {
      throw new IllegalArgumentException("El cliente no puede ser nulo");
    }
    this.cliente = cliente;
  }

  public void agregarProducto(Producto producto) {
    productos.add(producto);
  }

  public void cambiarEstado(EstadoPedido nuevoEstado) {
    if (cliente != null && nuevoEstado != this.estado) {
      this.estado = nuevoEstado;
      cliente.enviarNotificacion("Su pedido cambió a estado: " + estado.getDescripcion());
    }
  }

  public EstadoPedido getEstado() {
    return estado;
  }

  @Override
  public Double calcularTotal(Double monto) {
    if (productos.isEmpty()) {
      throw new IllegalStateException("El pedido no tiene productos");
    }

    double total = 0;
    for (Producto producto : productos) {
      total += producto.getPrecio();
    }
    System.out.println("El total del pedido es: $" + total);
    return total;
  }
}
