import DIP.GestorInventario;
import DIP.RepositorioProductos;
import DIP.RepositorioProductosEnMemoria;
import ISP.Descargable;
import ISP.Enviable;
import LSP.Producto;
import LSP.ProductoDigital;
import LSP.ProductoFisico;
import OCP.ProductoHibrido;

public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(50));
        System.out.println("DEMOSTRACIÓN DE PRINCIPIOS SOLID");
        System.out.println("=".repeat(50));

        // ===== DIP: Dependency Inversion Principle =====
        System.out.println("\n1. DIP - Dependency Inversion Principle");
        System.out.println("Gestor que depende de abstracción, no de implementación concreta");

        RepositorioProductos repositorio = new RepositorioProductosEnMemoria();
        GestorInventario gestorDIP = new GestorInventario(repositorio);

        // ===== LSP: Liskov Substitution Principle =====
        System.out.println("\n2. LSP - Liskov Substitution Principle");
        System.out.println("ProductoFisico y ProductoDigital son intercambiables como Producto");

        Producto libro = new ProductoFisico("Libro Java", 29.99, 0.5);
        Producto juego = new ProductoDigital("Juego Indie Versión Digital", 9.99, 150.0);

        gestorDIP.registrarProducto(libro);
        gestorDIP.registrarProducto(juego);
        gestorDIP.mostrarInventario();

        // ===== ISP: Interface Segregation Principle =====
        System.out.println("\n3. ISP - Interface Segregation Principle");
        System.out.println("Interfaces específicas: Enviable para físicos, Descargable para digitales");

        if (libro instanceof Enviable) {
            ((Enviable) libro).enviar("Calle 12 Carrera 25 Esquina Edificio Punto sur");
        }

        if (juego instanceof Descargable) {
            ((Descargable) juego).descargar();
        }

        // ===== SRP y OCP: Single Responsibility & Open/Closed Principles =====
        System.out.println("\n4. SRP & OCP - Single Responsibility & Open/Closed Principles");
        System.out.println("Sistema extendible sin modificar código existente");

        // SRP: Cada clase tiene una responsabilidad única
        SRP.GestorInventario gestorSRP = new SRP.GestorInventario();

        // Productos existentes - usando las clases correctas
        ProductoFisico libroFisico = new ProductoFisico("Clean Code", 35.99, 0.8);
        ProductoDigital software = new ProductoDigital("IDE Premium", 99.99, 500.0);

        // OCP: Agregamos nuevo tipo sin modificar código existente
        ProductoHibrido cursoOnline = new ProductoHibrido("Curso Java + Certificado", 149.99, 0.1, 2048.0);

        gestorSRP.agregarProducto(libroFisico);
        gestorSRP.agregarProducto(software);
        gestorSRP.agregarProducto(cursoOnline);

        gestorSRP.listarProductos();

        // SRP: Cálculos delegados a clase especializada
        System.out.println("\nEstadísticas del inventario:");
        System.out.println("Valor total: $" + String.format("%.2f", gestorSRP.calcularValorTotal()));
        System.out.println("Precio promedio: $" + String.format("%.2f", gestorSRP.calcularPromedio()));

        Producto masCaro = gestorSRP.encontrarMasCaro();
        Producto masBarato = gestorSRP.encontrarMasBarato();

        if (masCaro != null) {
            System.out.println("Más caro: " + masCaro.getNombre() + " ($" + masCaro.getPrecio() + ")");
        }
        if (masBarato != null) {
            System.out.println("Más barato: " + masBarato.getNombre() + " ($" + masBarato.getPrecio() + ")");
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("TODOS LOS PRINCIPIOS SOLID IMPLEMENTADOS CORRECTAMENTE");
        System.out.println("=".repeat(50));
    }
}