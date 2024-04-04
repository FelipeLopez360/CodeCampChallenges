public class JuegoDados implements Juego{
    //Atributos
    private  String jugador1;
    private String Jugador2;
    private int dado1;
    private int dado2;
    private int ganador;

    public JuegoDados(String jugador1, String jugador2, int dado1, int dado2, int ganador) {
        this.jugador1 = jugador1;
        Jugador2 = jugador2;
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.ganador = ganador;
    }

    public JuegoDados(){

    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return Jugador2;
    }

    public void setJugador2(String jugador2) {
        Jugador2 = jugador2;
    }

    public int getDado1() {
        return dado1;
    }

    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }

    public int getGanador() {
        return ganador;
    }

    public void setGanador(int ganador) {
        this.ganador = ganador;
    }
    //Implementamos los metodos abstractos de la interface
    @Override
    public void iniciar() {
        this.setDado1(0);
        this.setDado2(0);
        this.setGanador(0);
    }
    @Override
    public void jugar() {
        this.setDado1((int) ((Math.random()* 6)+1));
        this.setDado2((int) ((Math.random()* 6)+1));

    }
    @Override
    public void finalizar() {
        if (this.getDado1() > this.getDado2()){
            this.setGanador(1);
        }else if (this.getDado2()>this.getDado1()){
            this.setGanador(2);
        }else{
            this.setGanador(3);
        }
    }
}
