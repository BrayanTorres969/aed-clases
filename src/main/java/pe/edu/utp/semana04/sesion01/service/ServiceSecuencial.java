package pe.edu.utp.semana04.sesion01.service;

public class ServiceSecuencial {

    public int busquedaSecuencial(int[] datos, int elemento) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == elemento) {
                return i;//retorna el elemento encontrado
            }
        }
        return -1;//retorno cuando no se encuentra el elemento
    }
}
