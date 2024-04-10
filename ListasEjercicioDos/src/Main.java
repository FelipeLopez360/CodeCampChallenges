public class Main {
    public static void main(String[] args) {
        ejercicio2();
    }

    public static void ejercicio2() {
        Nodo cabeza = null;
        for (int i = 30; i >= 23; i--) {
            cabeza = new Nodo(i, cabeza);
            if (i % 5 == 0) { // Añadir nodos repetidos
                cabeza = new Nodo(i, cabeza);
            }
        }

        // Imprimir la lista enlazada original
        System.out.println("Lista original:");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();

        // Llamar al método eliminarDuplicados
        cabeza.eliminarDuplicados();

        // Imprimir la lista enlazada después de eliminar duplicados
        System.out.println("Lista después de eliminar duplicados:");
        actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}