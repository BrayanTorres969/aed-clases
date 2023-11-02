package pe.edu.utp.semana12.sesion01;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> practicas = new LinkedHashMap<String, String>();
        //Agregar valores
        practicas.put("prac1", "Programando con Java");
        practicas.put("prac2", "Programando con PHP");
        practicas.put("prac3", "Programando con C#");
        practicas.put("prac4", "Programando con Go");
        //Mostrar valores en el partir en el mismo orden que se ingresaron
        System.out.println(practicas);
        //Obteniendo un valor a partir de una llave
        System.out.println("Valor de la llave 'prac2': " + practicas.get("prac2"));
        //Obtemner el tamaño del hashMap
        System.out.println("Tamaño del HashMap: " + practicas.size());
        //Consultar si el HashMap esta vacia
        System.out.println("¿Está vacía en el HashMap?: " + practicas.isEmpty());
        //Consultar si el HashMap ontiene valores
        System.out.println("¿El HashMap contiene el valor 'Programando con Java'l" + practicas.containsValue("Programando con Java"));
        //Eliminar un elemento de HashMap
        System.out.println("Eliminar el elemento 'prac2' :" + practicas.remove("prac2"));
        //Mostrar valores en el partir en el mismo orden que se ingresaron
        System.out.println(practicas);


    }
}
