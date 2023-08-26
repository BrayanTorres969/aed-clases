package pe.edu.utp.semana02.sesion01;

public class DerechaIzquierdaBurbuja {
    public static void main(String[] args) {
        //Burbuja de derecha a izquierda
        int[] datos = {3, 2, 4, 1, 2, 0, 7, 1};

        for (int i = 1; i <= datos.length - 1; i++) {
            for (int j = datos.length - 1; j >= i; j--) {
                if (datos[j - 1] > datos[j]) {
                    int aux = datos[j - 1];
                    datos[j - 1] = datos[j];
                    datos[j] = aux;
                }
            }
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
    }
}
