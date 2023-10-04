package pe.edu.utp.semana07.sesion02.test;

import pe.edu.utp.semana07.sesion02.service.Computadora;
import pe.edu.utp.semana07.sesion02.service.Lista;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        String codigo, marca, modelo;
        double precio;

        char resp='S';
        Computadora compu = new Computadora();
        Lista lista = new Lista();
        while(resp=='S') {
            System.out.println("Seleccione: ");
            System.out.println("1. Insertar al principio \t2. Insertar al Final "
                    + "\t3. Insertar después \n.4 Obtener un objeto \t.5 Obtiene la dimensión"
                    + "\t6. Ver si la lista esta vacía \n7. Eliminar al inicio \t8. Eliminar al final"
                    + "\t9. Mostrar Elementos \t10. Eliminar computadora");
            int opcion = Leer.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese código: ");
                    codigo = Leer.next();
                    System.out.println("Ingrese marca: ");
                    marca = Leer.next();
                    System.out.println("Ingrese modelo: ");
                    modelo = Leer.next();
                    System.out.println("Ingrese precio: ");
                    precio = Leer.nextDouble();
                    compu = new Computadora(codigo,marca,modelo, precio);
                    lista.insertarPrincipio(compu);
                    break;
                case 2:
                    System.out.println("Ingrese código: ");
                    codigo = Leer.next();
                    System.out.println("Ingrese marca: ");
                    marca = Leer.next();
                    System.out.println("Ingrese modelo: ");
                    modelo = Leer.next();
                    System.out.println("Ingrese precio: ");
                    precio = Leer.nextDouble();
                    compu = new Computadora(codigo,marca,modelo, precio);
                    lista.insertarFinal(compu);
                    break;
                case 7:
                    lista.eliminarPrincipio();
                    break;
                case 8:
                    lista.eliminarUltimo();
                    break;

                case 9:
                    lista.mostrarLista();
                    break;
                case 10:
                    System.out.println("Ingrese el numero de nodo a eliminar");
                    int numero = Leer.nextInt();
                    lista.eliminarComputadora(numero);
                    break;
            }


            System.out.println("¿Desea continuar?");
            resp = Leer.next().charAt(0);
        }
    }
}