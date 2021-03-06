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
        Pila pilaAux = new Pila();
        while(!pila.vacia()) {
            pilaAux.apilar(pila.desapilar());
        }
        while (!pilaAux.vacia()) {
            pila.apilar(pilaAux.getCima());
            otraPila.apilar(pilaAux.desapilar());
        }
        return otraPila;
    }

    public int sumaNPilaRec(Pila pila, int n) {
        int suma;
        if(n <= 0 || pila.vacia()) {
            return 0;
        } else {
            int cima = pila.desapilar();
            suma = cima + sumaNPilaRec(pila, n-1);
            pila.apilar(cima);
        }
        return suma;
    }

    public Pila copiaPilaRec(Pila pila) {
        Pila otraPila;
        if(pila.vacia()) {
            otraPila = new Pila();
            return otraPila;
        } else {
            int cima = pila.desapilar();
            otraPila = copiaPilaRec(pila);
            otraPila.apilar(cima);
            pila.apilar(cima);
        }
        return otraPila;
    }
}

