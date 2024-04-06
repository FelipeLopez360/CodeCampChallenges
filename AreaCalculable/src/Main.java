import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************¡¡¡¡WELCOME!!!!********************");
        System.out.println("Seleccioná el Area a calcular");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Salir");
        System.out.println("****************************************************");

        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                Circulo calcularCirculo = new Circulo();
                System.out.println("Digitá en CMS el radio del Circulo: ");
                calcularCirculo.setRadio((double) scanner.nextInt());
                double areaCirculo = calcularCirculo.calcularArea();
                System.out.println("El Area del Circulo es: " + areaCirculo);
                break;
            case 2:
                Rectangulo calcularRectangulo = new Rectangulo();
                System.out.println("Digitá en CMS la altura del Rectangulo: ");
                calcularRectangulo.setAltura((double) scanner.nextInt());
                System.out.println("Digitá el valor en CMS de la base del Rectangulo: ");
                calcularRectangulo.setBase((double) scanner.nextInt());
                double areaCuadrado = calcularRectangulo.calcularArea();
                System.out.println("El Area del Rectangulo es: " + areaCuadrado);
                break;
            case 3:
                Triangulo calcularTriangulo = new Triangulo();
                System.out.println("Digitá en CMS la altura del Triángulo: ");
                calcularTriangulo.setBase((double) scanner.nextInt());
                System.out.println("Digitá el valor en CMS de la base del Triángulo: ");
                calcularTriangulo.setAltura((double) scanner.nextInt());
                double areaTriangulo = calcularTriangulo.calcularArea();
                System.out.println("El Area del Triángulo es: " + areaTriangulo);
                break;
            case 4:
                System.out.println("Hasta la proxima!");
                break;
        }
    }
}