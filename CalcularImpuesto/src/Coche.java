public class Coche extends Vehiculo{
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }
    @Override
    double calcularImpuesto() {
        return 1500000;
    }
}
