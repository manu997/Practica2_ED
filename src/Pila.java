public class Pila {

    private Nodo cima;
    private int numElementos;

    public Pila() {
        cima = null;
        numElementos = 0;
    }


    public boolean vacia() {
        return cima == null;
    }

    /**
     * Apila el dato en la cima de la pila
     */
    public void apilar(int dato) {
        Nodo nuevo = new Nodo(dato, cima);
        cima = nuevo;
          // O bien: cima = new NodoLE(dato, cima)
        numElementos++;
    }

    /**
     * Elimina la cima de la pila si existe, y devuelve como
     * resultado dicho dato.
     */
    public int desapilar() {
        int valor;
        if (this.vacia()) {
            System.out.println("Error, la pila está vacía");
            valor = -9999;
        } else {
            valor = cima.getDato();
            cima = cima.getSiguiente();
            numElementos--;
        }
        return valor;
    }

    /**
     * Devuelve la cima de la pila sin desapilarla
     */
    public int getCima() {
        int valor;
        if (this.vacia()) {
            System.out.println("Error, la pila está vacía");
            valor = -9999;
        } else {
            valor = cima.getDato();
        }
        return valor;
    }

    /**
     * Elimina el elemento de la cima de la pila
     */
    public void quitarCima() {
        if (this.vacia()) {
            System.out.println("Error, la pila está vacía");
        } else {
            cima = cima.getSiguiente();
            numElementos--;
        }
    }

    /**
     * Devuelve el número de elementos que contiene la pila
     */
    public int getNumElementos() {
        return numElementos;
    }

    /**
     * Visualiza el contenido de la pila
     */
    public void mostrar() {
        Nodo aux = cima;
        System.out.println("Contenido de la pila:");
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
        System.out.println("FIN");
    }


}
	
