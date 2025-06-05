package inventario;

public class ProductoFisico extends Producto {
    private double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String getTipo() {
        return "Físico";
    }
}