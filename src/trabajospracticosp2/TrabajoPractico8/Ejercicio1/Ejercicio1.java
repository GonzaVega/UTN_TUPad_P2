package trabajospracticosp2.TrabajoPractico8.Ejercicio1;

public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.println("SISTEMA DE E-COMMERCE\n");

    try {
      System.out.println("--- Creando productos ---");
      Producto laptop = new Producto("Laptop Dell", 1000.0);
      Producto mouse = new Producto("Mouse Logitech", 50.0);
      Producto teclado = new Producto("Teclado Mecánico", 150.0);
      System.out.println("Productos creados exitosamente.\n");

      Pedido pedido = new Pedido();
      pedido.agregarProducto(laptop);
      pedido.agregarProducto(mouse);
      pedido.agregarProducto(teclado);

      Cliente cliente = new Cliente("Juan Pérez", "juan@email.com");
      try {
        pedido.setCliente(cliente);
        System.out.println("Cliente asignado al pedido.\n");
      } catch (IllegalArgumentException e) {
        System.err.println("Error al asignar cliente: " + e.getMessage());
      }

      System.out.println("--- Calculando total del pedido ---");
      double totalPedido = 0;
      try {
        totalPedido = pedido.calcularTotal(0.0);
        System.out.println();
      } catch (IllegalStateException e) {
        System.err.println("Error al calcular total: " + e.getMessage());
        return;
      }

      System.out.println("--- Pago con Tarjeta de Crédito (10% descuento) ---");
      try {
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "Juan Pérez", 2000.0);
        tarjeta.procesarPago(totalPedido);
        System.out.println();
      } catch (IllegalArgumentException e) {
        System.err.println("Error al crear/procesar tarjeta: " + e.getMessage());
      }

      System.out.println("--- Cambios de estado del pedido ---");
      try {
        pedido.cambiarEstado(EstadoPedido.CONFIRMADO);
        pedido.cambiarEstado(EstadoPedido.EN_PROCESO);
        pedido.cambiarEstado(EstadoPedido.ENVIADO);
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
        System.out.println();
      } catch (Exception e) {
        System.err.println("Error al cambiar estado: " + e.getMessage());
      }

      System.out.println("--- Segundo pedido con PayPal ---");
      try {
        Pedido pedido2 = new Pedido();
        Producto auriculares = new Producto("Auriculares", 100.0);
        pedido2.agregarProducto(auriculares);
        
        double totalPedido2 = pedido2.calcularTotal(0.0);
        
        PayPal paypal = new PayPal("juan@email.com", 500.0);
        paypal.procesarPago(totalPedido2);
        System.out.println();
      } catch (IllegalArgumentException e) {
        System.err.println("Error con PayPal: " + e.getMessage());
      } catch (IllegalStateException e) {
        System.err.println("Error al calcular pedido: " + e.getMessage());
      }

      System.out.println("=== Sistema finalizado correctamente ===");

    } catch (IllegalArgumentException e) {
      System.err.println("❌ Error de argumento inválido: " + e.getMessage());
    } catch (Exception e) {
      System.err.println("❌ Error inesperado: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
