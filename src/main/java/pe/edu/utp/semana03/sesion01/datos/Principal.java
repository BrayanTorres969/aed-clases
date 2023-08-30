package pe.edu.utp.semana03.sesion01.datos;

import pe.edu.utp.semana03.sesion01.service.ServiceMetodo;

public class Principal {
    public static void main(String[] args) {

        ServiceMetodo sm = new ServiceMetodo();

        int[] arreglo = sm.Aleatorios();

        System.out.println("===========================");
        System.out.println("Datos sin ordenar");
        mostrarDatos(arreglo);
        System.out.println("\n===========================");
        System.out.println("Datos ordenados con QuickSort");
        int[] dataQuick = new int[20];
        dataQuick = sm.quicksort(arreglo,0,19);
        mostrarDatos(dataQuick);






    }

    public static void mostrarDatos(int[] arr){
        for (int num:
                arr) {
            System.out.print(num + " ");
        }
    }


}
