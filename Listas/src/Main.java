public class Main {
    public static void main(String[] args) {
        ejercicio1();
    }
    public static void ejercicio1() {
        //crear listas enlazadas con 5 nodos
        //con numeros aleatorios entre 20 y 90

        //1. creamos el primer nodo
        Nodo p = new Nodo();
        p.setValor((int)(Math.random() * 71) + 20);
        Nodo z = new Nodo();
        z=p;

        //2. creamos los siguientes nodos
        for (int i = 0; i < 5; i++) {
            Nodo q = new Nodo();
            q.setValor((int)(Math.random() * 71) + 20);
            z.setSiguiente(q);

            z = q;
            while (z.getSiguiente() != null) {
                System.out.println(z.getValor());
                z = z.getSiguiente();
            }
            System.out.println(z.getValor());
        }
    }
}