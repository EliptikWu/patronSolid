package LSP;

import ISP.Descargable;

public class ProductoDigital implements Producto, Descargable {
    private String nombre;
    private double precio;
    private double tamanoEnMB;

    public ProductoDigital(String nombre, double precio, double tamanoEnMB) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanoEnMB = tamanoEnMB;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public double getTamanoEnMB() { return tamanoEnMB; }

    @Override
    public void descargar() {
        System.out.println("Descargando " + nombre + " (" + tamanoEnMB + " MB)");
    }
}