import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto libro = new Libro("Soy Leyenda", 20000);
        Producto electrodomestico = new Electrodomestico("Computador DELL", 800000);

        List<Producto> productos = Arrays.asList(libro, electrodomestico);

        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + " - con descuento el valor final es: " + producto.calcularDescuento());
        }
    }
}