public class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo(int valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor() {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public void eliminarDuplicados() {
    Nodo p = this;
    while(p != null) {
        Nodo q = p;
        while(q.getSiguiente() != null) {
            if(p.getValor() == q.getSiguiente().getValor()) {
                q.setSiguiente(q.getSiguiente().getSiguiente());
            } else {
                q = q.getSiguiente();
            }
        }
        p = p.getSiguiente();
    }
}

}
