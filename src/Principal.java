public class Principal {

    public static void main(String[] args) {
        // 2.2. Algoritmo sumaNPila //

        Pila pila = new Pila();
        pila.apilar(7);
        pila.apilar(17);
        pila.apilar(4);
        pila.apilar(1);
        pila.apilar(6);
        pila.mostrar();
        AlgoritmosPila ap = new AlgoritmosPila();
        System.out.println(ap.sumaNPila(pila, 3));
        System.out.println(ap.sumaNPila(pila, 8));
        System.out.println(ap.sumaNPila(pila, 0));
        System.out.println(ap.sumaNPila(pila, -2));
        pila.mostrar();
        Pila pila1 = new Pila();
        System.out.println(ap.sumaNPila(pila1, 2));

        System.out.println();

        // 2.3. Algoritmo copiaPila //

        pila.mostrar();
        Pila otraPila = ap.copiaPila(pila);
        otraPila.apilar(2);
        pila.mostrar();
        otraPila.mostrar();

        System.out.println();

        // 3.1 Algoritmo sumaNPilaRec //

        pila.mostrar();
        System.out.println(ap.sumaNPilaRec(pila, 3));
        System.out.println(ap.sumaNPilaRec(pila, 8));
        System.out.println(ap.sumaNPilaRec(pila, 0));
        System.out.println(ap.sumaNPilaRec(pila, -2));
        pila.mostrar();
        Pila pilaVacia = new Pila();
        System.out.println(ap.sumaNPilaRec(pilaVacia, 2));

        System.out.println();

        // 3.2 Algoritmo copiaPilaRec //

        pila.mostrar();
        Pila otraPila1 = ap.copiaPilaRec(pila);
        otraPila1.apilar(2);
        pila.mostrar();
        otraPila1.mostrar();

        System.out.println();

        // 4.1 Algoritmo invertirCola //

        Cola cola = new Cola();
        cola.encolar(7);
        cola.encolar(4);
        cola.encolar(12);
        cola.encolar(2);
        cola.encolar(6);
        cola.mostrar();
        AlgoritmosPila ap1 = new AlgoritmosPila();
        ap.invertirCola(cola);
        cola.mostrar();
        Cola colaVacia = new Cola();
        ap.invertirCola(colaVacia);

        System.out.println();

        // 4.2 Algoritmo eliminarUltimoCola //

        cola.encolar(2);
        cola.mostrar();
        ap.eliminarUltimoCola(cola);
        cola.mostrar();
        Cola colaVacia1 = new Cola();
        ap.eliminarUltimoCola(colaVacia);
    }
}
