package pe.edu.utp.semana07.sesion02.service;

public class Lista {
    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {
        public Computadora compu;
        public Nodo siguiente = null;

        public Nodo(Computadora compu) {
            this.compu = compu;
        }
    }

    // método para insertar nodo al principio de lista
    public void insertarPrincipio(Computadora compu) {
        Nodo nodo = new Nodo(compu);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    // Método para insertar un nodo al final de lista
    public void insertarFinal(Computadora compu) {
        Nodo nodo = new Nodo(compu);
        // Evaluar el contenido de la variable cabeza
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

    // Método para insertar después de un nodo o elemento de una lista
    public void insertarDespues(int num, Computadora compu) {
        Nodo nodo = new Nodo(compu);
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

    // Método para obtener un objeto de un nodo
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
                return puntero.compu;
            }
        }
    }

    // Método que obtiene la dimensión de la lista
    public int contar() {
        return longitud;
    }

    // Método que verifica si la lista se encuentra vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método que permite mostrar los elementos de cada uno de los nodos
    public void mostrarLista() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.compu.getCodigo() + " " + aux.compu.getMarca() + " " + aux.compu.getModelo() + " "
                    + aux.compu.getPrecio());
            aux = aux.siguiente;
        }
    }

    // Metodo para eliminar elemento al inicio del nodo
    public void eliminarPrincipio() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud--;
        }
    }

    // Metodo para eliminar elemento al final del nodo
    public void eliminarUltimo() {
        if (cabeza != null) {
            if (cabeza.siguiente == null) {
                cabeza = null;
                longitud--;
            } else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }
        }
    }
    // Metodo para Eliminar un elemento de una posición indicada
    public void eliminarComputadora(int n) {
        if (cabeza !=null) {
            if (n == 0) {
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud--;

            }else if(n<longitud) {
                Nodo puntero = cabeza;
                int contador = 0;
                while ( contador < (n - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }
        }
    }
}
