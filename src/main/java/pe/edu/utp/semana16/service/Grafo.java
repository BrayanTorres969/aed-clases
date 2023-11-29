package pe.edu.utp.semana16.service;

import java.util.LinkedList;

public class Grafo {

    private int V;
    private LinkedList<Integer>[] listaAdyacente;

    //Constructor
    public Grafo(int v) {
        V = v;
        listaAdyacente = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            listaAdyacente[i] = new LinkedList<>();
        }
    }

    //Método para agregar una arista al grafo
    public void agregarArista(int v, int w) {
        //Agrega w a la lista de v
        listaAdyacente[v].add(w);

    }

    //Método que imprime el grafo dirigido
    public void imprimirGrafo() {
        for (int i = 0; i < V; i++) {
            System.out.println("Lista adyacente del vértice " + i);
            System.out.println("Cabeza");
            for (Integer integer : listaAdyacente[i]) {
                System.out.print("-> " + integer);
            }
            System.out.println();
        }

    }


}
