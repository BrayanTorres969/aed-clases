package pe.edu.utp.semana02.sesion01;

public class InsercionDirecta {
    public static void main(String[] args) {

        int datos[] = {3, 2, 4, 1, 2};
        //Insercion directa
        for (int i = 1; i <= datos.length - 1; i++) {

            int aux = datos[i];
            int j = i - 1;

            while (datos[j] > aux && j > 0) {
                datos[j + 1] = datos[j];
                j = j - 1;
            }

            if (datos[j] > aux) {
                datos[j + 1] = datos[j];
                datos[j] = aux;
            } else {
                datos[j + 1] = aux;
            }

        }

        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
    }
}
