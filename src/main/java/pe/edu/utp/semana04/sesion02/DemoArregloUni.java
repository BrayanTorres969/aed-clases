package pe.edu.utp.semana04.sesion02;

import java.util.Scanner;

public class DemoArregloUni {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        ArregloUni vector = new ArregloUni();
        int x = 0, pos = 0, sw = 1, opcion;
        do {
            System.out.println();
            System.out.println("Procesamiento de un arreglo Unidimensional");
            System.out.println("0. salir");
            System.out.println("1. Ingreso");
            System.out.println("2. Reporte");
            System.out.println("3. Localiza elemento");
            System.out.println("4. Inserta elemento");
            System.out.println("5. Suprime elemento");
            System.out.println("Opcion ===>");
            opcion = Leer.nextInt();
            switch (opcion) {
                case 0:
                    sw = 0;
                    break;
                case 1:
                    vector.ingreso();
                    break;
                case 2:
                    vector.reporte();
                    break;
                case 3:
                    if (vector.cantidad() > 0) {
                        System.out.println("Valor a localizar: ");
                        x = Leer.nextInt();
                        pos = vector.localizar(x);
                        if (pos == -1) {
                            System.out.println("No se encuentra");
                        } else {
                            System.out.println("Esta en el indice: " + pos);
                        }
                    } else {
                        System.out.println("Esta vacio");
                    }
                    break;
                case 4:
                    System.out.println("Valor a insertar");
                    x = Leer.nextInt();
                    System.out.println("Indice :");
                    pos = Leer.nextInt();
                    vector.insertar(x, pos);
                    break;
                case 5:
                    System.out.println("Indice del valor a suprimir: ");
                    pos = Leer.nextInt();
                    vector.suprimir(pos);
                    break;
            }
        } while (sw == 1);

    }
}
