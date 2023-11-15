package pe.edu.utp.semana14.sesion01.test;

import pe.edu.utp.semana14.sesion01.service.ArbolBinarioBusqueda;

public class Principal {

    public static void main(String[] args) {
        ArbolBinarioBusqueda arbolBinarioBusqueda = new ArbolBinarioBusqueda();

        //crear un arreglo para pasar al árbol
        int datos[] = {5, 10, 3, 6, 9, 14, 18, 2, 7};
        //Insertar datos al árbol
        for (int dato : datos) {
            arbolBinarioBusqueda.insertar(dato);
        }

        //Buscar un dato en el arbol
        boolean encontrado = arbolBinarioBusqueda.buscar(7);


        if (encontrado) {
            System.out.println("El valor está en el árbol ");
        } else {
            System.out.println("El valor no está en el árbol");
        }


    }
}