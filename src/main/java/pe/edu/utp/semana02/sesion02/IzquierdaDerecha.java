package pe.edu.utp.semana02.sesion02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pe.edu.utp.semana02.sesion02.SeleccionDirecta.redondear;

public class IzquierdaDerecha {
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

        //Ordenamiento Burbuja de Izquierda a Derecha
        for (int i = productos.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (productos.get(j).getPrecio() > productos.get(j + 1).getPrecio()) {
                    Producto aux = productos.get(j);
                    productos.set(j, productos.get(j + 1));
                    productos.set(j + 1, aux);
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
    }
}
