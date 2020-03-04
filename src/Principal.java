public class Principal {

    public static void main(String[] args) {
        // 2.2. Algoritmo sumaNPila

        Pila pila = new Pila();

        pila.apilar(7);
        pila.apilar(17);
        pila.apilar(4);
        pila.apilar(1);
        pila.apilar(6);

        //pila.mostrar();

        AlgoritmosPila ap = new AlgoritmosPila();
/*
        System.out.println(ap.sumaNPila(pila, 3));
        System.out.println(ap.sumaNPila(pila, 8));
        System.out.println(ap.sumaNPila(pila, 0));
        System.out.println(ap.sumaNPila(pila, -2));

        pila.mostrar();

        Pila pila1 = new Pila();
        System.out.println(ap.sumaNPila(pila1, 2));*/

        // 2.3. Algoritmo copiaPila
        /*pila.mostrar();

        Pila otraPila = ap.copiaPila(pila);
        otraPila.apilar(2);

        pila.mostrar();
        otraPila.mostrar();*/

        // 3.1 Algoritmo sumaNPilaRec
        pila.mostrar();

        System.out.println(ap.sumaNPilaRec(pila, 3));
        System.out.println(ap.sumaNPilaRec(pila, 8));
        System.out.println(ap.sumaNPilaRec(pila, 0));
        System.out.println(ap.sumaNPilaRec(pila, -2));

        pila.mostrar();

        Pila pilaVacia = new Pila();
        System.out.println(ap.sumaNPilaRec(pilaVacia, 2));

        // 3.2 Algoritmo copiaPilaRec


    }

}
