package pe.edu.utp.semana16.test;

import pe.edu.utp.semana16.service.Grafo;

public class Principal {
    public static void main(String[] args) {
        //Número de vértices
        int V = 4;
        //Instancia de la clase Grafo
        Grafo grafo = new Grafo(V);
        //Agregar aristas

        grafo.agregarArista(0,1);
        grafo.agregarArista(0,2);
        grafo.agregarArista(1,2);
        grafo.agregarArista(2,0);
        grafo.agregarArista(2,3);
        grafo.agregarArista(3,3);

        //Imprimir grafo
        System.out.println("GRAFO DIRIGIDO");
        grafo.imprimirGrafo();

    }
}
