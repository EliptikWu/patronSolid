package OCP;

import LSP.Producto;
import ISP.Enviable;
import ISP.Descargable;

// OCP: Nueva funcionalidad sin modificar código existente
public class ProductoHibrido implements Producto, Enviable, Descargable {
    private String nombre;
    private double precio;
    private double peso;
    private double tamanoMB;

    public ProductoHibrido(String nombre, double precio, double peso, double tamanoMB) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.tamanoMB = tamanoMB;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public String getTipo() {
        return "Híbrido (Físico + Digital)";
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Enviando componente físico de '" + nombre + "' (" + peso + "kg) a: " + direccion);
    }

    @Override
    public void descargar() {
        System.out.println("Descargando contenido digital de '" + nombre + "' (" + tamanoMB + " MB)");
    }
}