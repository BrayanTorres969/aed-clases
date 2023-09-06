package pe.edu.utp.semana04.sesion01.service;

public class ServiceMetodo {
    public int busquedaBinaria(int[] arreglo, int nro) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            //si el elemento esta en el medio
            if (arreglo[medio] == nro) {
                return medio;
            }
            //Si el elemento es mayor, ignoramos la mitad izquierda
            if (arreglo[medio] < nro) {
                izquierda = medio + 1;
                //si el elemento es menor, ignoramos la mitad derecha
            } else {
                derecha = medio - 1;
            }
        }
        //si no se encuentra el elemento
        return -1;
    }
}
