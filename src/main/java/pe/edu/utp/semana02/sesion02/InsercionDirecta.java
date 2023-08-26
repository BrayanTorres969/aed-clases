package pe.edu.utp.semana02.sesion02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pe.edu.utp.semana02.sesion02.SeleccionDirecta.redondear;

public class InsercionDirecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        //Ordenamiento por Inserción directa
        for (int i = 1; i <= productos.size() - 1; i++) {
            Producto aux = productos.get(i);
            int j = i - 1;
            while (productos.get(j).getPrecio() > aux.getPrecio() && j > 0) {
                productos.set(j + 1, productos.get(j));
                j = j - 1;
            }

            if (productos.get(j).getPrecio() > aux.getPrecio()) {
                productos.set(j + 1, productos.get(j));
                productos.set(j, aux);
            } else {
                productos.set(j + 1, aux);
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
    }
}
