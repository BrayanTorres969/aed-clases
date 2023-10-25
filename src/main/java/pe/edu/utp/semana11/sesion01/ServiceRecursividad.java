package pe.edu.utp.semana11.sesion01;

public class ServiceRecursividad {
    //Funcion o método recursivo que calcula el factorial de un número entero positivo

    public int factorial(int num) {
        //caso base
        if (num == 0) {
            return 1;
        }
        //caso iterativo
        //representa un subproblema más pequeño
        return num * factorial(num - 1);
    }
}
