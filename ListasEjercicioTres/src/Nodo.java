public class Nodo {
    private int valor;
    private Nodo siguiente;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(int valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
    class listaEnlazada{
        Nodo cabeza;

        public void agregarNodo(int valor){
            Nodo nuevoNodo = new Nodo(valor, null);
            if(cabeza == null){
                cabeza = nuevoNodo;
            }else{
                Nodo ultimoNodo = cabeza;
                while (ultimoNodo.getSiguiente() != null){
                    ultimoNodo = ultimoNodo.getSiguiente();
                }
                ultimoNodo.setSiguiente(nuevoNodo);
            }
        }
    }
}
