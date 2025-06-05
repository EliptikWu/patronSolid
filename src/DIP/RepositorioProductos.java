package DIP;

import LSP.Producto;

public interface RepositorioProductos {
    void agregarProducto(Producto producto);
    void listarProductos();
}
