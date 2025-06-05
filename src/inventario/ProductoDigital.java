package inventario;

public class ProductoDigital extends Producto {
    private double tamanoMB;

    public ProductoDigital(String nombre, double precio, double tamanoMB) {
        super(nombre, precio);
        this.tamanoMB = tamanoMB;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    @Override
    public String getTipo() {
        return "Digital";
    }
}