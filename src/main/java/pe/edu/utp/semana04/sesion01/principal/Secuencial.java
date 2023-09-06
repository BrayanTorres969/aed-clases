package pe.edu.utp.semana04.sesion01.principal;

import pe.edu.utp.semana04.sesion01.service.ServiceSecuencial;

import java.util.Scanner;

public class Secuencial {
    public static void main(String[] args) {
        ServiceSecuencial ss = new ServiceSecuencial();
        Scanner leer = new Scanner(System.in);

        int[] arreglo = {9, 3, 5, 17, 60, 8, 15, 96, 47, 11, 35};
        System.out.println("Ingresa el número a buscar: ");
        int elementoBuscado = leer.nextInt();
        //Enviar el metodo busquedaSecuencial el arreglo el numero a buscar
        int resultado = ss.busquedaSecuencial(arreglo, elementoBuscado);
        if (resultado != -1) {
            System.out.println("El elemento buscado " + elementoBuscado + " se encuentra en la posicion " + resultado);
        } else {
            System.out.println("El elemento buscado " + elementoBuscado + " no se encuentra en el arreglo ");
        }


    }
}
