package pe.edu.utp.semana02.sesion02;

import static pe.edu.utp.semana02.sesion02.SeleccionDirecta.redondear;

/*
Ejercicio nro. 01
Se requiere un algoritmo que pida el ingreso del nombre del producto y el precio,
cada producto tiene un descuento de 15%; mostrar de manera ordenada en forma ascendente
desde los producto más económicos a los más caros, además se debe mostrar el promedio
de venta.
*/
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = redondear(precio * 0.85);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
