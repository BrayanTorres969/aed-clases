package pe.edu.utp.semana14.sesion01.service;

public class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;

    //Constructor de nodo
    public Nodo(int item) {
        valor = item;
        izquierda = null;
        derecha = null;
    }
}
