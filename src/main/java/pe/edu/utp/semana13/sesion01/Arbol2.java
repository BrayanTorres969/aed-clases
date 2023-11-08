package pe.edu.utp.semana13.sesion01;

public class Arbol2 {
    Nodo raiz;

    public Arbol2() {
        this.raiz = null;
    }

    //Método para insertar un nodo en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    //Método auxiliar para insertar un nuevo nodo
    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }
        return raiz;
    }

    //Método para realizar un recorrido en orden Inorden del arbol
    public void recorridoInorden() {
        recorridoInordenRec(raiz);

    }

    //Método auxiliar para realizar un recorrido inorden del arbol
    private void recorridoInordenRec(Nodo nodo) {
        if (nodo != null) {
            recorridoInordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInordenRec(nodo.derecho);
        }
    }
}
