public class Camion extends Vehiculo{
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }
    @Override
    double calcularImpuesto() {
        return 3600000;
    }
}
