public class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }

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

    public Nodo ordenarLista(){
        Nodo nodoInicial = this;
        Nodo nodoActual = this;
        Nodo nodoSiguiente = null;
        int temporal;

        while (nodoActual != null){
            nodoSiguiente = nodoActual.siguiente;

            while (nodoSiguiente != null){
                if(nodoActual.valor > nodoSiguiente.valor){
                    temporal = nodoActual.valor;
                    nodoActual.valor = nodoSiguiente.valor;
                    nodoSiguiente.valor = temporal;
                }
                nodoSiguiente = nodoSiguiente.siguiente;
            }
            nodoActual = nodoActual.siguiente;
        }
        return nodoInicial;
    }
}


