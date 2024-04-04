import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner dato = new Scanner(System.in);

        System.out.println("*******************Bienvenido*******************");
        System.out.println("Selecciona una opción de juego:");
        System.out.println("1. Lanzar Dados");
        System.out.println("2. Adivinar el número");
        System.out.println("3. Salir");
        System.out.println("************************************************");

        int opcion = dato.nextInt();
        switch (opcion){
            case 1:
                //creamos el objeto de la clase
                JuegoDados lanzar = new JuegoDados();
                System.out.println("Bienvenido al juego de los Dados.");
                System.out.println("Digita el nombre del jugador 1: ");
                lanzar.setJugador1(dato.next());
                System.out.println("Digita el nombre del jugador 2: ");
                lanzar.setJugador2(dato.next());

                lanzar.iniciar();

                // Simular un retraso de 3 segundos para lanzar los dados y entregar los resultados
                try {

                    System.out.println("Lanzando el dado para " + lanzar.getJugador1() + "...");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Lanzando el dado para " + lanzar.getJugador2() + "...");
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    System.err.println("Error al dormir el hilo: " + e.getMessage());
                }
                lanzar.jugar();
                System.out.println("Los resultados son.....");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("El jugador " + lanzar.getJugador1() + " obtuvo " + lanzar.getDado1());
                TimeUnit.SECONDS.sleep(2);
                System.out.println("El jugador " + lanzar.getJugador2() + " obtuvo " + lanzar.getDado2());
                TimeUnit.SECONDS.sleep(2);
                lanzar.finalizar();
                if (lanzar.getGanador() == 1){
                    System.out.println("Ganador: "+ lanzar.getJugador1() + " FELICITACIONES!!!!!");
                }else if (lanzar.getGanador() == 2){
                    System.out.println("Ganador: "+ lanzar.getJugador2() + " FELICITACIONES!!!!!");
                }else{
                    System.out.println("Empate técnico!");
                }
                break;

            case 2:
                JuegoAdivinar juegoAdivinar = new JuegoAdivinar();
                System.out.println("Bienvenido al juego de adivinar un numero");
                System.out.println("Digita el nombre del jugador: ");
                juegoAdivinar.setJugador(dato.next());


                System.out.println("_________________________________________");
                System.out.println("Tienes 3 intentos para adivinar el número");
                System.out.println("_________________________________________");
                System.out.println("Ingresa un numero de 1 a 10: ");
                juegoAdivinar.iniciar();

                while (juegoAdivinar.getIntentos() < 3){
                    System.out.println("Digita un numero: ");
                    juegoAdivinar.setNumero_jugador(dato.nextInt());
                    juegoAdivinar.jugar();
                    System.out.println(juegoAdivinar.getResultado());
                    if (juegoAdivinar.getResultado().equals("¡Felicidades, eres el ganador!")){
                        break;
                    }
                    juegoAdivinar.setIntentos(juegoAdivinar.getIntentos() + 1);
                }
                juegoAdivinar.finalizar();
                break;

            case 3:
                System.out.println("Gracias por participar!!!");
        }
    }
}