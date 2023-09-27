package pe.edu.utp.semana07.sesion01.service;

public class Lista {
    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {
        public Computadora computadora;
        public Nodo siguiente = null;

        public Nodo(Computadora computadora) {
            this.computadora = computadora;
        }
    }

    //Método para insertar nodo al principio de la lista
    public void insertarPrincipio(Computadora computadora) {
        Nodo nodo = new Nodo(computadora);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;

    }

    //Método para insertar un nodo al final de la lista
    public void insertarFinal(Computadora computadora) {
        Nodo nodo = new Nodo(computadora);
        //Evaluar el contenido de la variable cabeza
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }

            puntero.siguiente = nodo;
        }

        longitud++;
    }

    //Método para insertar despues de un nodo o elemento de una lista
    public void insertarDespues(int num, Computadora computadora) {
        Nodo nodo = new Nodo(computadora);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < num && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    //Método para obtener un objeto de un nodo
    public Computadora obtener(int num) {
        if (cabeza == null) {
            return null;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < num && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != num) {
                return null;
            } else {
                return puntero.computadora;
            }
        }


    }

    //Método que obtiene la dimensión de la lista
    public int contar() {
        return longitud;
    }

    //Método para identificar si una lista esta vacia
    public boolean estaVacia() {
        return cabeza == null;
    }


}
