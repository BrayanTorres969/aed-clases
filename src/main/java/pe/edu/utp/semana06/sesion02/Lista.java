package pe.edu.utp.semana06.sesion02;

public class Lista {
    Nodo inicio, fin;
    int cont = 0;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void agregarAlInicio(String dato) {
        cont++;
        if (estaVacia()) {
            inicio = new Nodo(dato, inicio);
            fin = inicio;
        } else {
            inicio = new Nodo(dato, inicio);
        }
    }

    public void agregarAlFinal(String dato) {
        cont++;
        if (estaVacia()) {
            inicio = new Nodo(dato);
            fin = inicio;
        } else {
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        }
    }

    private boolean estaVacia() {
        return inicio == null;
    }

    public void mostrarLista() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.print("[" + aux.dato + "]");
            aux = aux.siguiente;
        }
    }

    public int cantidadNodos() {
        return cont;
    }
}
