public class Main {
    public static void main(String[] args) {
        ejercicio1();
    }
    public static void ejercicio1(){
        Nodo p = new Nodo();
        p.setValor((int)(Math.random() * 251) -50 );
        Nodo z = p;

        for (int i = 0; i < 9; i++) {
            Nodo q = new Nodo();
            q.setValor((int) (Math.random() * 251) - 50);
            z.setSiguiente(q);

            z = q;
        }
        p = p.ordenarLista();

        Nodo nodosOrdenados = p;
        while (nodosOrdenados != null){
            System.out.println(nodosOrdenados.getValor());
            nodosOrdenados = nodosOrdenados.getSiguiente();
        }

    }

}
