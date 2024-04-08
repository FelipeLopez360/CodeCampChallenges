import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************¡¡¡¡WELCOME!!!!********************");
        System.out.println("Digita el texto de las palabras a contar: ");
        String texto = scanner.nextLine();
        int contadorPalabras = ContadorPalabras.contadorPalabras(texto);
        System.out.println("El número de palabras es: " + contadorPalabras);
    }
}