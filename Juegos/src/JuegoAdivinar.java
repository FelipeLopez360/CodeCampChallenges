public class JuegoAdivinar implements Juego{

    private String jugador;
    private int numero_jugador;
    private int numero_computador;
    private int intentos;
    private String resultado;

    public JuegoAdivinar(String jugador, int numero_jugador, int numero_computador, int intentos, String resultado) {
        this.jugador = jugador;
        this.numero_jugador = numero_jugador;
        this.numero_computador = numero_computador;
        this.intentos = intentos;
        this.resultado = resultado;
    }

    public JuegoAdivinar(){

    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getNumero_jugador() {
        return numero_jugador;
    }

    public void setNumero_jugador(int numero_jugador) {
        this.numero_jugador = numero_jugador;
    }

    public int getNumero_computador() {
        return numero_computador;
    }

    public void setNumero_computador(int numero_computador) {
        this.numero_computador = numero_computador;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public void iniciar() {
        this.setNumero_computador((int) ((Math.random() * 10)+ 1));
    }

    @Override
    public void jugar() {
        int numero_jugador = this.getNumero_jugador();

        if (numero_jugador < 1 || numero_jugador > 10) {
            this.setResultado("El número ingresado está fuera del rango permitido (1 a 10). Menos un intento...Por favor, hagamolo de nuevo.");
        } else {
            if (numero_jugador > this.getNumero_computador()) {
                this.setResultado("Parece que el número es Menor, ingresa otro.....");
            } else if (numero_jugador < this.getNumero_computador()) {
                this.setResultado("Parece que el número es Mayor, ingresa otro.....");
            } else {
                this.setResultado("¡Felicidades, eres el ganador!");
            }
        }
    }
    @Override
    public void finalizar() {
        System.out.println("El número secreto era: "+ this.getNumero_computador()  + " Gracias por jugar!");

    }
}
