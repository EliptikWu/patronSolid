package inventario;

import java.util.ArrayList;
import java.util.List;

public class GestorInventario {
    private List<Producto> productos;

    public GestorInventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio() + " - Tipo: " + p.getTipo());
        }
    }

    public double calcularValorTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}

