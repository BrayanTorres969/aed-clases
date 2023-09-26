package pe.edu.utp.semana06.sesion02;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num;
        String nombre;
        char resp = 'S';
        Lista lista = new Lista();
        while (resp == 'S') {
            System.out.println("1.Insertar al inicio \t2.Insertar al final");
            System.out.println("3.Mostrar elementos \t4.Numero de elementos");
            num = Leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Ingrese un nombre: ");
                    nombre = Leer.next();
                    lista.agregarAlInicio(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese un nombre: ");
                    nombre = Leer.next();
                    lista.agregarAlFinal(nombre);
                    break;
                case 3:
                    System.out.println("Elementos de la lista: ");
                    lista.mostrarLista();
                    break;
                case 4:
                    System.out.println("Numero de elementos: " + lista.cantidadNodos());
                    break;
                default:
                    System.out.println("Error al seleccionar opcion");
            }
            System.out.println("\nDesea continuar? S/N: ");
            resp = Leer.next().charAt(0);
        }

    }

}