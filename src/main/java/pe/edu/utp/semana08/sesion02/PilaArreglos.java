package pe.edu.utp.semana08.sesion02;

public class PilaArreglos {
    private int maxSize;
    private int[] arreglo;
    private int top;

    public PilaArreglos(int size) {
        maxSize = size;
        arreglo = new int[maxSize];
        top = -1;// Inicializar el tope de la pila como-1(pila vacía)
    }

    public void push(int elemento) {
        if (top < maxSize - 1) {
            arreglo[++top] = elemento;
            System.out.println("Pushed: " + elemento);

        } else {
            System.out.println("La pila está llena. No se puede hacer push.");
        }
    }

    public int pop() {
        if (top >= 0) {
            int elemento = arreglo[top--];
            System.out.println("Popped: " + elemento);
            return elemento;

        } else {
            System.out.println("La pila esta vacia. No se puede hacer pop");
            return -1;
        }

    }

    public int peek() {
        if (top >= 0) {
            int elemento = arreglo[top];
            System.out.println("Elemento en la cima de la pila: " + elemento);
            return elemento;

        } else {
            System.out.println("La pila esta vacia. No hay elemento en la cima. ");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public void showElements() {
        for (int numero :
                arreglo) {
            System.out.print("[" + numero + "] ");
        }
        System.out.println();
    }
}
