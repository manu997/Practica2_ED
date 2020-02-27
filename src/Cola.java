public class Cola {
    private Nodo cabeza, fin;
    private int numElementos;

    public Cola() {
        cabeza = null;
        fin = null;
        numElementos = 0;
    }

    /**
     * Determina si la cola está vacía o no
     */
    public boolean vacia() {   // Comprueba si la cola está vacía
        return cabeza == null;
    }

    /**
     * Coloca el dato al final de la cola, si es posible.
     */
    public void encolar(int dato) {    // Coloca el elemento v al final de la cola
        Nodo nuevo;
        nuevo = new Nodo(dato, null);
        if (!this.vacia()) {
            fin.setSiguiente(nuevo);
        } else {
            cabeza = nuevo;
        }
        fin = nuevo;
        numElementos++;
    }

    /**
     * Elimina el primer elemento de la cola y lo devuelve, si es posible.
     */
    public int desencolar() {
        int valor;
        if (this.vacia()) {
            System.out.println("Error al desencolar, la cola está vacía");
            valor = -9999;
        } else {
            valor = cabeza.getDato();
            cabeza = cabeza.getSiguiente();
            if (cabeza == null) {  // La cola se queda vacía
                fin = null;
            }
            numElementos--;
        }
        return valor;
    }

    /**
     * Devuelve el primer elemento de la cola sin eliminarlo, si es posible.
     */
    public int getPrimero() {
        int valor;
        if (!this.vacia()) {
            valor = cabeza.getDato();
        } else {
            System.out.println("Error, la cola está vacía");
            valor = -9999;
        }
        return valor;
    }

    /**
     * Devuelve el número de elementos que contiene la cola
     */
    public int getNumElementos() {
        return numElementos;
    }

    /**
     * Visualiza el contenido de la cola
     */
    public void mostrar() {
        Nodo aux;
        System.out.println("Contenido de la cola: ");
        aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
        System.out.println("FIN");
    }

}