package pe.edu.utp.semana06.sesion01;

public class Nodo {
    private int dato;
    private Nodo siguienteNodo;
    //Métodos constructores
    //Constructor que permite agregar al final del nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguienteNodo = null;
    }
    //Constructor que permite agregar al inicio del nodo
    public Nodo(int dato, Nodo siguienteNodo) {
        this.dato = dato;
        this.siguienteNodo = siguienteNodo;
    }
    //Métodos get y set
    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }
    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
}
