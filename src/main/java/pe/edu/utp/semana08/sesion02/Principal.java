package pe.edu.utp.semana08.sesion02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        char opcion = 'S';
        int tamanho;
        PilaArreglos pila = null;

        while (opcion == 'S') {

            System.out.println("***** Seleccione una opción *****");
            System.out.println("1.Ingresar elementos \n2.Eliminar\n3.Ver la cima\n4.Ver si la pila está " +
                    "vacía\n5.Mostrar elemtos\n6 Ver el tamaño de la pila");
            int eleccion = Leer.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("¿Cúantos elementos deseas ingresar?");
                    tamanho = Leer.nextInt();
                    pila = new PilaArreglos(tamanho);
                    for (int i = 0; i < tamanho; i++) {

                        System.out.println("Ingresa el elemento " + (i + 1));
                        int elemento = Leer.nextInt();
                        pila.push(elemento);
                    }
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    System.out.println(pila.peek());
                    break;
                case 4:
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacia");
                    } else {
                        System.out.println("La pila tiene elementos");
                    }
                    break;
                case 5:
                    if (pila != null && pila.size() > 0) {
                        pila.showElements();
                    } else {
                        System.out.println("No hay elementos que mostrar, ingrese elementos");
                    }
                    break;
                case 6:
                    if (pila != null) {
                        System.out.println("El tamaño de la pila es: " + pila.size());
                    } else {
                        System.out.println("La pila no tiene elementos");
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            System.out.println("¿Desea continuar S/N?");
            opcion = Leer.next().charAt(0);

        }
    }

}
