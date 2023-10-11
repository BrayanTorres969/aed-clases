package pe.edu.utp.semana09.sesion01.ejercicio01;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String[] args) {
        //Crear cola
        Queue<String> cola = new LinkedList<>();
        //Agregar elementos a la cola (encolar)
        cola.offer("Juan");
        cola.offer("Juanito");
        cola.offer("Juanita");
        cola.offer("Juancho");
        //Mostrar elementos de la cola
        System.out.println("Elementos de la cola" + cola);
        //Obtener y eleminar un elemento del frente de la cola
        //desencolar
        String elementoDeFrente = cola.poll();
        System.out.println("Elementos de la cola" + cola);

        //Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿La cola esta vacía?: " + estaVacia);

        //Obtener el tamaño de la cola
        System.out.println("El tamaño de la cola es " + cola.size());


    }
}
