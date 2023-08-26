package pe.edu.utp.semana02.sesion02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pe.edu.utp.semana02.sesion02.SeleccionDirecta.redondear;

public class DerechaIzquierda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantProductos;
        double venta = 0;
        //validar que la cantidad de productos sea un número positivo
        do {
            System.out.println("Ingrese la cantidad de productos");
            cantProductos = sc.nextInt();
        } while (cantProductos <= 0);

        Producto[] productos = new Producto[cantProductos];

        //Llenar la lista con los productos ingresados
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese el nombre del producto: " + (i + 1));
            String nombre = sc.next();
            System.out.println("Ingrese el precio del producto: " + (i + 1));
            double precio = sc.nextDouble();
            Producto producto = new Producto(nombre, precio);
            productos[i] = producto;
        }

        //Ordenamiento Burbuja de Derecha a Izquierda
        for (int i = 1; i <= productos.length - 1; i++) {
            for (int j = productos.length - 1; j >= i; j--) {
                if (productos[j - 1].getPrecio() > productos[j].getPrecio()) {
                    Producto aux = productos[j - 1];
                    productos[j - 1] = productos[j];
                    productos[j] = aux;
                }
            }
        }
        //Mostrar precios de los  más económicos a los más caros.
        System.out.println("====Lista de Productos (15% Desc) ====");
        for (Producto prod :
                productos) {
            System.out.println(prod.getNombre() + " -> S/ " + prod.getPrecio());
            venta += prod.getPrecio();
        }
        //Mostrar el promedio de la venta
        double ventProm = venta / productos.length;
        System.out.println("=======================================");
        System.out.println("La venta es: S/ " + redondear(venta));
        System.out.println("El promedio de venta es S/ : " + redondear(ventProm));
        //Fin del Algoritmo
        /*
        List<Producto> productos = new ArrayList<>();
        int cantProductos;
        double venta = 0;
        //validar que la cantidad de productos sea un número positivo
        do {
            System.out.println("Ingrese la cantidad de productos");
            cantProductos = sc.nextInt();
        } while (cantProductos <= 0);

        //Llenar la lista con los productos ingresados
        for (int i = 0; i < cantProductos; i++) {
            System.out.println("Ingrese el nombre del producto: " + (i + 1));
            String nombre = sc.next();
            System.out.println("Ingrese el precio del producto: " + (i + 1));
            double precio = sc.nextDouble();
            Producto producto = new Producto(nombre, precio);
            productos.add(producto);
        }

        //Ordenamiento Burbuja de Derecha a Izquierda
        for (int i = 1; i <= productos.size() - 1; i++) {
            for (int j = productos.size() - 1; j >= i; j--) {
                if (productos.get(j - 1).getPrecio() > productos.get(j).getPrecio()) {
                    Producto aux = productos.get(j - 1);
                    productos.set(j - 1, productos.get(j));
                    productos.set(j, aux);
                }
            }
        }
        //Mostrar precios de los  más económicos a los más caros.
        System.out.println("====Lista de Productos (15% Desc) ====");
        for (Producto prod :
                productos) {
            System.out.println(prod.getNombre() + " -> S/ " + prod.getPrecio());
            venta += prod.getPrecio();
        }
        //Mostrar el promedio de la venta
        double ventProm = venta / productos.size();
        System.out.println("=======================================");
        System.out.println("La venta es: S/ " + redondear(venta));
        System.out.println("El promedio de venta es S/ : " + redondear(ventProm));

         */
    }
}
