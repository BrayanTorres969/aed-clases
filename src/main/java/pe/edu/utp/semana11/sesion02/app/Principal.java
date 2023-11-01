package pe.edu.utp.semana11.sesion02.app;

import pe.edu.utp.semana11.sesion02.service.FibonacciService;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        char resp = 'S';
        FibonacciService fs = new FibonacciService();
        do {
            System.out.println("Seleccione su Fibonacci");
            System.out.println("1.Iterativo 2.Recursivo");
            int opcion = Leer.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el numero de serie: ");
                    int num = Leer.nextInt();
                    fs.FibonacciIterativo(num);
                    break;
                case 2:
                    System.out.println("Ingrese un numero de serie");
                    int num2 = Leer.nextInt();
                    int result = fs.FibonacciRecursivo(num2);

                    // System.out.println("El valor final es: "+result);
                    for (int i = 0; i < num2; i++) {
                        System.out.println(fs.FibonacciRecursivo(i));
                    }
            }
            System.out.println("¿Desea continuar?");
            resp = Leer.next().charAt(0);
        } while (resp == 'S');
    }
}

