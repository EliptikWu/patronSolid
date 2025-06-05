package LSP;

import ISP.Enviable;

public class ProductoFisico implements Producto, Enviable {
    private String nombre;
    private double precio;
    private double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
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

    public String getTipo() {
        return "Físico";
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("Enviando '" + nombre + "' de " + peso + "kg a la dirección: " + direccion);
    }
}