package pe.edu.utp.semana12.sesion02;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {

    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        //Agregar elementos al hashtable
        hashtable.put("Adela", 1);
        hashtable.put("Amelia", 2);
        hashtable.put("Adeliz", 3);
        hashtable.put("Alice", 4);
        //Obteniendo valores del hastable
        int valueA = hashtable.get("Adela");
        System.out.println("Valor de Adela: " + valueA);

        //Eliminando elemento del hastable
        hashtable.remove("Amelia");
        //Ver si el hashtable esta vacio
        System.out.println("Está vacío el hashtable?: " + hashtable.isEmpty());
        //Enumerando los elementos del hastable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Llave: " + key + ", valor: " + hashtable.get(key));
        }
    }
}

