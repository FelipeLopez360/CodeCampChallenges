public class Electrodomestico extends Producto{
    public Electrodomestico(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    double calcularDescuento() {
        return getPrecio() * 0.30;
    }
}
