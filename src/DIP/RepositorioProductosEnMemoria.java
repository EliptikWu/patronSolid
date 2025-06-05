package DIP;

import LSP.Producto;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProductosEnMemoria implements RepositorioProductos {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println("- " + p.getNombre() + ": $" + p.getPrecio());
        }
    }
}
