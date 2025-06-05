package DIP;

import LSP.Producto;

public class GestorInventario {
    private RepositorioProductos repositorio;

    public GestorInventario(RepositorioProductos repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarProducto(Producto producto) {
        repositorio.agregarProducto(producto);
    }

    public void mostrarInventario() {
        repositorio.listarProductos();
    }
}
