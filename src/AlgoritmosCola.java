public class AlgoritmosCola {

    public void invertirCola(Cola cola) {
        Pila pilaAux = new Pila();
        while(!cola.vacia()) {
            pilaAux.apilar(cola.desencolar());
        }
        while(!pilaAux.vacia()) {
            cola.encolar(pilaAux.desapilar());
        }
    }

    public void eliminarUltimoCola(Cola cola) {
        if (!cola.vacia()) {
            Pila pilaAux = new Pila();
            while (!cola.vacia()) {
                pilaAux.apilar(cola.desencolar());
            }
            int ultimoCola = pilaAux.getCima();
            pilaAux.quitarCima();
            while (!pilaAux.vacia()) {
                if (pilaAux.getCima() == ultimoCola) {
                    pilaAux.quitarCima();
                }
                cola.encolar(pilaAux.desapilar());
            }
            invertirCola(cola);
        }
    }
}
