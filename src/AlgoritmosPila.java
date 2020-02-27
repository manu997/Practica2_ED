public class AlgoritmosPila {

    public int sumaNPila(Pila pila, int n) {
        int suma = 0;
        Pila pilaAux = new Pila();
        while(!pila.vacia() && n>0) {
            int elemento = pila.desapilar();
            suma += elemento;
            pilaAux.apilar(elemento);
            n--;
        }
        while(!pilaAux.vacia()) {
            pila.apilar(pilaAux.desapilar());
        }
        return suma;
    }

    public Pila copiaPila(Pila pila) {
        Pila otraPila = new Pila();
        while(!pila.vacia()) {
            int elemento = pila.desapilar();
            otraPila.apilar(elemento);
        }
        return otraPila;
    }

    public int sumaNPilaRec(Pila pila, int n) {
        // TODO Implementar este método
        return 0; // Eliminar el return al implementar el método
    }

    public Pila copiaPilaRec(Pila pila) {
        // TODO Implementar este método
        return null;  // Eliminar el return al implementar el método
    }

}

