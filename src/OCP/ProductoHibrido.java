package OCP;

import LSP.Producto;

public class ProductoHibrido extends Producto {
    private double peso;
    private double tamanoMB;

    public ProductoHibrido(String nombre, double precio, double peso, double tamanoMB) {
        super(nombre, precio);
        this.peso = peso;
        this.tamanoMB = tamanoMB;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    @Override
    public String getTipo() {
        return "Híbrido (Físico + Digital)";
    }
}
