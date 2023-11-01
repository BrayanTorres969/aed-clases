package pe.edu.utp.semana11.sesion02.service;

public class FibonacciService {
    public void FibonacciIterativo(int serie) {
        int suma = 1, num1 = 0, num2 = 1;
        // MUESTRA EL VALOR INICIAL
        System.out.println(num1);
        for (int i = 1; i < serie; i++) {
            // MUESTRA LA SUMA
            System.out.println(suma);
            // PRIMERO SUMAMOS
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }

    public int FibonacciRecursivo(int n) {
        // CASO BASE
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return FibonacciRecursivo(n - 1) + FibonacciRecursivo(n - 2);
        }

    }
}

