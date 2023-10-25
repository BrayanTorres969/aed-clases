package pe.edu.utp.semana11.sesion01;

import java.util.Scanner;

public class Factorial01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        //declarar variables
        int num;
        double factorial = 1;

        //estructura repetitva que permite obtener solamente números enteros positivos
        do {
            System.out.println("Ingrese un número entero");
            num = Leer.nextInt();
        } while (num < 0);

        //Multiplicar los números desde 1 hasta el valor ingresado
        for (int i = 1; i <= num; i++) {

            //El resultado de las multiplicaciones se acumula en la variable factorial
            factorial *= i;

        }
        //Mostrar el resultado
        System.out.println("El factorial de " + num + " es " + factorial);


    }

}


