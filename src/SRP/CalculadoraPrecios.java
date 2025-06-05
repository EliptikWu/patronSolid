package SRP;

import LSP.Producto;

import java.util.List;

// SRP: Responsabilidad única de realizar cálculos de precios
public class CalculadoraPrecios {

    public double calcularValorTotal(List<Producto> productos) {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public double calcularPromedio(List<Producto> productos) {
        if (productos.isEmpty()) return 0;
        return calcularValorTotal(productos) / productos.size();
    }

    public Producto encontrarMasCaro(List<Producto> productos) {
        return productos.stream()
                .max((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
                .orElse(null);
    }

    public Producto encontrarMasBarato(List<Producto> productos) {
        return productos.stream()
                .min((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
                .orElse(null);
    }
}