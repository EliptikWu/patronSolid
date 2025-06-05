import DIP.GestorInventario;
import DIP.RepositorioProductos;
import DIP.RepositorioProductosEnMemoria;
import ISP.Descargable;
import ISP.Enviable;
import LSP.Producto;
import LSP.ProductoDigital;
import LSP.ProductoFisico;
import inventario.*;

public class Main {
    public static void main(String[] args) {
        RepositorioProductos repositorio = new RepositorioProductosEnMemoria();
        GestorInventario gestor = new GestorInventario(repositorio);

        Producto libro = new ProductoFisico("Libro Java", 29.99, 0.5);
        Producto juego = new ProductoDigital("Juego Indie Versión Digital", 9.99, 150.0);

        gestor.registrarProducto(libro);
        gestor.registrarProducto(juego);

        gestor.mostrarInventario();

        if (libro instanceof Enviable) {
            ((Enviable) libro).enviar("Calle 12 Carrera 25 Esquina Edificio Punto sur");
        }

        if (juego instanceof Descargable) {
            ((Descargable) juego).descargar();
        }
    }
}
