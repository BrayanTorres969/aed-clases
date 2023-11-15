package pe.edu.utp.semana14.sesion01.service;

public class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    //Método para insertar un valor nuevo en árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }

        return nodo;
    }

    //Método para buscar un valor en el  árbol
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    public boolean buscarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }

        if (valor == nodo.valor) {
            return true;
        }

        if (valor < nodo.valor) {
            return buscarRecursivo(nodo.izquierda, valor);
        } else {
            return buscarRecursivo(nodo.derecha, valor);
        }
    }

}
