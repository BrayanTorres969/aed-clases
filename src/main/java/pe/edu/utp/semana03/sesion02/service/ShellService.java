package pe.edu.utp.semana03.sesion02.service;

import java.util.Random;

public class ShellService {

    public int[] aleatorios() {
        int[] arreglo = new int[10];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100);
        }
        return arreglo;
    }

    public void shellSort(int[] arreglo, int tamano) {

        for (int intervalo = tamano / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < tamano; i++) {
                int temp = arreglo[i];
                int j;
                for (j = i; j >= intervalo && arreglo[j - intervalo] > temp; j -= intervalo) {
                    arreglo[j] = arreglo[j - intervalo];
                }
                arreglo[j] = temp;
            }

        }
    }
}
