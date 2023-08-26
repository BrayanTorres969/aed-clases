package pe.edu.utp.semana02.sesion01;

public class IzquierdaDerechaBurbuja {
    public static void main(String[] args) {

        //Burbuja de Izquierda a derecha
        int[] datos = {3, 2, 4, 1, 2,0,7,1};
        for (int i = datos.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;

                }
            }
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]+" ");
        }

    }
}