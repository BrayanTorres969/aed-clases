package pe.edu.utp.semana09.sesion02.service;

public class Nodo {
    private Object dato;
    private Nodo siguiente;
    public Nodo(Object dato, Nodo siguiente) {
        super();
        this.dato = dato;
        this.siguiente = siguiente;
    }
    public Object getDato() {
        return dato;
    }
    public void setDato(Object dato) {
        this.dato = dato;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


}