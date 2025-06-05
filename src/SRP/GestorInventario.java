package SRP;
import LSP.Producto;

import java.util.ArrayList;
import java.util.List;

// SRP: Responsabilidad única de gestionar la colección de productos
public class GestorInventario {
    private List<Producto> productos;
    private CalculadoraPrecios calculadora;

    public GestorInventario() {
        this.productos = new ArrayList<>();
        this.calculadora = new CalculadoraPrecios();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(p -> p.getNombre().equals(nombre));
        System.out.println("Producto eliminado: " + nombre);
    }

    public void listarProductos() {
        System.out.println("\n=== INVENTARIO ===");
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio() + " - Tipo: " + p.getTipo());
        }
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos); // Copia defensiva
    }

    // Delegamos los cálculos a la clase especializada
    public double calcularValorTotal() {
        return calculadora.calcularValorTotal(productos);
    }

    public double calcularPromedio() {
        return calculadora.calcularPromedio(productos);
    }

    public Producto encontrarMasCaro() {
        return calculadora.encontrarMasCaro(productos);
    }

    public Producto encontrarMasBarato() {
        return calculadora.encontrarMasBarato(productos);
    }
}