public class Libro extends Producto{
    public Libro(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    double calcularDescuento() {
        return getPrecio() * 0.20;
    }
}
