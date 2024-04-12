import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        balanceada();
    }

    public static void varios() {
        // 1. creamos una pila
        Stack dato = new Stack();
        // 2. agregamos elementos a la pila con los primeros 10 numeros impares
        for (int i = 1; i < 20; i += 2) {
            dato.push(i);
        }
        System.out.println("Pila: " + dato);
        // 3. eliminamos el elemento en la cima de la pila
        dato.pop();
        System.out.println("Pila: " + dato);
        System.out.println("Tamaño Pila: " + dato.size());
    }

    public static void balanceada(){
        // 1. creamos la pila de caracteres.
        Stack<Character> pila = new Stack<>();
        // 2. solicitamos los datos por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena de caracteres: ");
        String cadena = scanner.nextLine();
        // 3. recorremos la cadena de caracteres
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '('){
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty() == false){
                    pila.pop();
                }
            }
        }
        // 4. verificamos si la pila esta vacia
        if (pila.isEmpty()){
            System.out.println("La cadena de caracteres esta balanceada");
        } else {
            System.out.println("La cadena de caracteres NO esta balanceada");
        }
    }
}