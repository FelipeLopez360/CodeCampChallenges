import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        varios();
    }
    public static void varios(){
        // 1. creamos la estructura ti cola
        Queue<Integer> cola = new LinkedList<Integer>();
        // 2. agregamos elementos a la cola con 10 numeros aleatorios
        for (int i = 0; i < 10; i++) {
            cola.add((int) (Math.random() * 401) + 100);
        }
        System.out.println("Cola: " + cola);
        System.out.println("Tamaño Cola: " + cola.size());
    }
}