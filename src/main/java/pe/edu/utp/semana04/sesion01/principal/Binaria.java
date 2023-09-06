package pe.edu.utp.semana04.sesion01.principal;

import pe.edu.utp.semana04.sesion01.service.ServiceMetodo;

import java.util.Scanner;

public class Binaria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiceMetodo sm = new ServiceMetodo();

        int[] arreglo = {5, 10, 17, 23, 29, 35, 45, 80, 88};
        System.out.println("Ingresa el número a buscar: ");
        int elementoBuscado = leer.nextInt();
        int resultado = sm.busquedaBinaria(arreglo, elementoBuscado);
        if (resultado != -1) {
            System.out.println("El elemento buscado " + elementoBuscado + " se encuentra en la posicion " + resultado);
        } else {
            System.out.println("El elemento buscado " + elementoBuscado + " no se encuentra en el arreglo ");
        }
    }
}
