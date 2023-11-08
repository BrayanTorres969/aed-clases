package pe.edu.utp.semana13.sesion01;

public class Arbol {
    //Crear la raiz del arbol
    Nodo raiz;

    //constructor de Arbol
    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    public static void main(String[] args) {
        Arbol arbol = new Arbol(10);

        arbol.raiz.izquierdo = new Nodo(5);
        arbol.raiz.derecho = new Nodo(15);

        //mostrar datos del árbol
        System.out.println("valor de la ráiz " + arbol.raiz.valor);
        System.out.println("valor del hijo izquierdo " + arbol.raiz.izquierdo.valor);
        System.out.println("valor del hijo derecho " + arbol.raiz.derecho.valor);
    }
}
