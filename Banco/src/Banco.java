import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Banco {
    public static void main(String[] args) throws InterruptedException {
        simulacion1();
    }
    public  static void simulacion1() throws InterruptedException {
        Queue<String> colaClientes = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("------------------ADMIN------------------");
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender cliente");
            System.out.println("3. Salir");
            System.out.println("-----------------------------------------");

            System.out.println("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.println("Cliente agregado");
                    colaClientes.add(nombreCliente);
                    break;
                case 2:
                    if (!colaClientes.isEmpty()) {
                        String clienteAtendido = colaClientes.poll();
                        System.out.println("Atendiendo cliente...");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("Cliente atendido: " + clienteAtendido);
                    }else{
                        System.out.println("No hay clientes para atender");
                    }
                    break;
                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.println("Saliendo del sistema");
                    System.out.println("-----------------------------------------");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}