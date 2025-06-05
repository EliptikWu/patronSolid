import LSP.Producto;
import LSP.ProductoDigital;
import LSP.ProductoFisico;
import inventario.*;

public class Main {
    public static void main(String[] args) {
        RepositorioProducto repositorio = new RepositorioProductoMemoria();
        GestorInventario gestor = new GestorInventario(repositorio);

        Producto fisico = new ProductoFisico("Laptop", 1200.00);
        Producto digital = new ProductoDigital("Antivirus", 49.99);

        gestor.registrarProducto(fisico);
        gestor.registrarProducto(digital);

        gestor.mostrarProductos();
    }
}