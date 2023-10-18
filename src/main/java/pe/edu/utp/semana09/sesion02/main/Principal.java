package pe.edu.utp.semana09.sesion02.main;

import pe.edu.utp.semana09.sesion02.service.Cola;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        char respuesta = 'S';
        Cola cola = new Cola();
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1.Verificar 2.Agregar 3.Eliminar 4.E.C.P. 5.Mostrar");
            int opcion = Leer.nextInt();
            switch (opcion) {
                case 1:

                    boolean estado = cola.vacia();
                    System.out.println("¿Esta vacia? "+estado);
                    break;
                case 2:
                    System.out.println("¿Cuantos elementos deseas ingresar?");
                    int num = Leer.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Ingrese el dato: ");
                        int dato= Leer.nextInt();
                        cola.encolar(dato);
                    }
                    break;

                case 3:
                    cola.desencolar();
                    break;

                case 4:
                    System.out.println("¿Que elementos desea eliminar?: ");
                    int dato= Leer.nextInt();
                    cola.eliminar(dato);
                    break;
                case 5:
                    String resultado=cola.mostrar();
                    System.out.println(resultado);

            }
            System.out.println("¿Desea continuar?");
            respuesta = Leer.next().charAt(0);
        }while(respuesta == 'S' ||  respuesta == 's');
    }

}