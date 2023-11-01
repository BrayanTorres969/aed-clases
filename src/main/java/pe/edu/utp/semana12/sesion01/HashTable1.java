package pe.edu.utp.semana12.sesion01;

import java.util.HashMap;

public class HashTable1 {

    public static void main(String[] args) {
        //Método que crea un hashTable a partir de una matriz
        int arreglo[] = {20, 40, 15, 20,20,40,15};
        crearHashTable(arreglo);
    }

    static void crearHashTable(int arreglo[]) {
        //Crear un HashMap vacío
        HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();

        //Recorrer la matriz dada
        for (int i = 0; i < arreglo.length; i++) {
            //Obtener si el elemento esta presente
            Integer elemento = mapa.get(arreglo[i]);
            //si es la primera vez que aparece el elemento
            if (mapa.get(arreglo[i]) == null) {
                mapa.put(arreglo[i], 1);
                //Si ya existen elementos, se incrementa el recuento
            } else {
                mapa.put(arreglo[i], ++elemento);
            }

        }
        //Mostrar HashMap
        System.out.println(mapa);

    }

}
