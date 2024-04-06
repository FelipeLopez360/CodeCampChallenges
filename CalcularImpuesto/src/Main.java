import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Honda","Civic");
        Camion camion = new Camion("Mercedes-benz","Super Truck");

        List<Vehiculo> vehiculos = Arrays.asList(camion,coche);

        for (Vehiculo vehiculo:vehiculos){
            System.out.println("El Impuesto para el vehiculo " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " es de: " + vehiculo.calcularImpuesto());
        }

    }
}