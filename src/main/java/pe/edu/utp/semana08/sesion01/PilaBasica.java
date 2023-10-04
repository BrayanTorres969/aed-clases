package pe.edu.utp.semana08.sesion01;

import java.util.Scanner;
import java.util.Stack;

public class PilaBasica {
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        //Declarar o crear una pila
        Stack<String> pila = new Stack<String>();
        //Consultar si la pila tiene elementos
        System.out.println("Ver elementos de la pila: "+pila);
        //Preguntar si la pila está vacía
        System.out.println("¿Está vacia la pila?: "+pila.isEmpty());
        //Agregar elementos a la pila
        System.out.println("¿Cuántos elementos deseas agregar?: ");
        int num=Leer.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Agrega elemento: "+(i+1));
            String nombre=Leer.next();
            pila.push(nombre);
        }
        //Consultar si la pila tiene elementos
        System.out.println("Ver elementos de la pila: "+pila);
        //Preguntar si la pila está vacía
        System.out.println("¿Está vacia la pila?: "+pila.isEmpty());
        //Desapila el último elemento ingresado
        pila.pop();
        System.out.println("Lista: "+pila);
        //Ubica un elemento el pila
        System.out.println("¿Elemento en la posición?: "+pila.search("Cueva"));
        //Muestra el elemento de la cima
        System.out.println("Elemento de la cima: "+pila.peek());
        //Obtener el tamaño o dimensión de la pila
        System.out.println("Tamaño de la pila: "+pila.size());
        System.out.println("Primer elemento ingresado: "+pila.firstElement());
        System.out.println("Último elemento ingresado de la pila"+pila.lastElement());
    }
}

