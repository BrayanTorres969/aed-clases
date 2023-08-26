package pe.edu.utp.semana02.sesion02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeleccionDirecta {
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

        //Ordenamiento por Selección Directa
        for (int i = 0; i < productos.length - 1; i++) {
            for (int j = i + 1; j < productos.length; j++) {

                if (productos[j].getPrecio() < productos[i].getPrecio()) {
                    Producto aux = productos[j];
                    productos[j] = productos[i];
                    productos[i] = aux;
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

        //Ordenamiento por Selección Directa
        for (int i = 0; i < productos.size() - 1; i++) {
            for (int j = i + 1; j < productos.size(); j++) {

                if (productos.get(j).getPrecio() < productos.get(i).getPrecio()) {
                    Producto aux = productos.get(j);
                    productos.set(j, productos.get(i));
                    productos.set(i, aux);
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

    public static double redondear(double num) {
        return Math.round(num * 100.0) / 100.0;
    }
}
