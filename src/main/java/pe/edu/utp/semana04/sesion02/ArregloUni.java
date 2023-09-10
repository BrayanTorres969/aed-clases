package pe.edu.utp.semana04.sesion02;

import java.util.Scanner;

public class ArregloUni {
    Scanner Leer = new Scanner(System.in);
    static int MAX = 20;
    int n;
    int a[] = new int[MAX];

    //Metodo que devuelve el tamano del arreglo
    public int cantidad() {
        return n;
    }

    //Metodo que permite ingresar datos al arreglo
    public void ingreso() {
        int i, cant;
        do {
            System.out.print("Cuantos elementos: ");
            cant = Leer.nextInt();
        } while (cant < 1 || cant > MAX);
        for (int j = 0; cant > j; j++) {
            System.out.print("elemento " + j + ":");
            a[j] = Leer.nextInt();
        }
        n = cant;
    }

    //Metodo que permite generar un reporte de datos
    public void reporte() {
        int i;
        if (n > 0) {
            for (i = 0; n > i; i++) {
                System.out.print("[" + a[i] + "]");
            }
        } else {
            System.out.println("Esta vacio");
        }
    }

    //Metodo para localizar datos
    public int localizar(int x) {
        int i = 0;
        if (n > 0) {
            while (i < n - 1 && x != a[i]) {
                i++;
            }
            if (x == a[i]) {
                return i;
            } else {
                return -1;
            }
        }
        return -2;
    }

    // Metodo para insertar Datos
    public void insertar(int x, int pos) {
        int i;
        if ((n > 0) && (n) != MAX) {
            for (i = n - 1; pos <= i; i--) {
                a[i + 1] = a[i];
            }
            a[pos] = x;
            n = n + 1;
        } else if (n > 0) {
            System.out.println("Desbordamiento");
        } else {
            System.out.println("Está vacío");
        }
    }

    // Metodo para eliminar datos
    public void suprimir(int pos) {
        int i;
        if (n > 0) {
            for (i = pos; n - 1 > i; i++) {
                a[i] = a[i + 1];
            }
            n = n - 1;
        } else {
            System.out.println("Está vacío");
        }
    }
}
