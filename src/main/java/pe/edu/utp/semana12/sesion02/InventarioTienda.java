package pe.edu.utp.semana12.sesion02;

import java.util.Hashtable;

public class InventarioTienda {
    public static void main(String[] args) {
        // Crear un HashTable para el inventario
        Hashtable<String, Integer> inventario = new Hashtable<>();

        // Agregar productos al inventario con su cantidad
        inventario.put("Camiseta", 100);
        inventario.put("Pantalón", 75);
        inventario.put("Zapatos", 50);
        inventario.put("Gorra", 200);
        inventario.put("Lentes", 150);

        // Realizar ventas y actualizar el inventario
        realizarVenta(inventario, "Camiseta", 5);
        realizarVenta(inventario, "Pantalón", 2);
        realizarVenta(inventario, "Zapatos", 10);
        realizarVenta(inventario, "Gorra", 20);
        realizarVenta(inventario, "Lentes", 7);

        // Mostrar el inventario actualizado

        System.out.println("Inventario actual");
        for (String producto : inventario.keySet()) {
            int cantidad = inventario.get(producto);
            System.out.println(producto + " : " + cantidad);
        }

    }

    private static void realizarVenta(Hashtable<String, Integer> inventario, String producto, int cantidadVendida) {
        if (inventario.containsKey(producto)) {
            int cantidadActual = inventario.get(producto);
            if (cantidadActual >= cantidadVendida) {
                inventario.put(producto, cantidadActual - cantidadVendida);
                System.out.println("Venta realizada: " + cantidadVendida + " unidades de producto: " + producto);
            } else {
                System.out.println("No hay suficiente Stock de " + producto);

            }
        } else {
            System.out.println("El producto " + producto + " no existe en el inventario");
        }

    }

}

