package pe.edu.utp.semana03.sesion01.service;

import java.util.Random;

public class ServiceMetodo {

    //Método que genere un arreglo con datos de manera aleatoria
    public  int[] Aleatorios(){
        int arr[] = new int[20];
        Random numeroAleatorio = new Random();
        int valor = 0;
        String concatenar ="";
        for (int i = 0; i < arr.length; i++) {
            valor = numeroAleatorio.nextInt(100);
            concatenar += valor + " ";
            arr[i] =valor;
        }
        return arr;

    }
    //Método Quicksort con particion
    public int particion(int arr[], int inicial, int fin){
        int pivote = fin;
        int id = inicial;

        for (int i = inicial; i < fin; i++) {
            if(arr[i] < arr[pivote]){
                int temp = arr[id];
                arr[id] = arr[i];
                arr[i] = temp;
                id++;
            }
        }
        int aux = arr[pivote];
        arr[pivote] = arr[id];
        arr[id] = aux;

        return id;

    }

    //Recursividad de QuickSort
    public int[] quicksort(int arr[], int inicial, int fin){
        if (fin <= inicial){
            return arr;
        }
        int pivot = particion(arr,inicial,fin);
        quicksort(arr,inicial,pivot -1);
        quicksort(arr,pivot +1,fin);
        return arr;

    }



}
