/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospracticosp2.TrabajoPractico6.Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author GonzaVega
 */
public class Ejercicio1 {
    public static void cargarInventario(Inventario inventario){
        Producto fideos = new Producto("201", "Fideos", 1000, 2, CategoriaProducto.ALIMENTOS);
        Producto notebook = new Producto("202", "Notebook", 3000, 1, CategoriaProducto.ELECTRONICA);
        Producto campera = new Producto("203", "Campera", 1500, 3, CategoriaProducto.ROPA);
        Producto mesa = new Producto("204", "Mesa", 8000, 1, CategoriaProducto.HOGAR);
        Producto zapatillas = new Producto("205", "Zapatillas", 5000, 3, CategoriaProducto.ROPA);
        
        inventario.agregarProducto(fideos);
        inventario.agregarProducto(notebook);
        inventario.agregarProducto(campera);
        inventario.agregarProducto(mesa);
        inventario.agregarProducto(zapatillas);
    }
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        cargarInventario(inventario);
        
        inventario.listarProductos();
        
        System.out.println("---------------------------------------");
        
        // buscar producto por id
        Producto buscar = inventario.buscarProductoPorId("204");
        if (buscar == null) {
            System.out.println("No se encontro el producto");
        } else {
            System.out.println("Se encontro el producto " + buscar);
        }
        
        System.out.println("---------------------------------------");
        
        inventario.eliminarProducto("205");
        
        System.out.println("---------------------------------------");
        
        for (Producto producto: inventario.filtrarPorCategoria(CategoriaProducto.HOGAR)){
            System.out.println(producto);
        }
        
        System.out.println("---------------------------------------");
        
        System.out.println(inventario.actualizarStock("202", 5) == null ? "No se pudo actualizar" : "Actualizado: " + inventario.actualizarStock("202", 5));
        
        System.out.println(inventario.actualizarStock("204", -3) == null ? "No se pudo actualizar (cantidad negativa)" : "Actualizado: " + inventario.actualizarStock("204", -3));
        
        System.out.println("---------------------------------------");
        
        System.out.println("El total de unidades en stock: " + inventario.obtenerTotalStock());
        
        System.out.println("---------------------------------------");
        
        System.out.println(inventario.obtenerProductoConMayorStock() == null ? "Inventario vacio" : "Producto con mayor stock " + inventario.obtenerProductoConMayorStock());
        
        System.out.println("---------------------------------------");
        
        System.out.println("Productos entre 1500 y 3000");
        for (Producto producto: inventario.filtrarProductosPorPrecio(1500, 3000)){
            System.out.println(producto);
        }
        
        System.out.println("---------------------------------------");
        
        System.out.println("Categorias que estan en el inventario: " + inventario.mostrarCategoriasDisponibles());
    }
}