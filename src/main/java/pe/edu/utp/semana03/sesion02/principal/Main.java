package pe.edu.utp.semana03.sesion02.principal;

import pe.edu.utp.semana03.sesion02.service.ShellService;

public class Main {
    public static void main(String[] args) {
        ShellService ss = new ShellService();
        int[] datos = new int[10];
        datos = ss.aleatorios();
        System.out.println("*** Datos sin ordenar ***");
        for (int num :
                datos) {
            System.out.print(num + " ");
        }
        ss.shellSort(datos, datos.length);
        System.out.println("\n*** Datos ordenados con ShellShort ***");
        for (int num :
                datos) {
            System.out.print(num + " ");
        }
    }
}
