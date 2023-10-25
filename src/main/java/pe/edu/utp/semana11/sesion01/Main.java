package pe.edu.utp.semana11.sesion01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        ServiceRecursividad sr = new ServiceRecursividad();

        //declarar variables
        int num;
        int factorial;
        String resp = "S";

        while (resp.equals("S")) {

            //estructura repetitva que permite obtener solamente números enteros positivos
            do {
                System.out.println("Ingrese un número positivo");
                num = Leer.nextInt();
            } while (num < 0);

            factorial = sr.factorial(num);
            //Mostrar el resultado
            System.out.println("El factorial de " + num + " es " + factorial);

            System.out.println("¿Deseas continuar? S/N");
            resp = Leer.next();

        }


    }

}

