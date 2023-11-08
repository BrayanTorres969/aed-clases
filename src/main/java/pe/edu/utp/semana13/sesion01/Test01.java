package pe.edu.utp.semana13.sesion01;

public class Test01 {
    public static void main(String[] args) {
        Arbol2 arbol = new Arbol2();
        arbol.insertar(50);
        arbol.insertar(10);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(90);
        arbol.insertar(99);

        System.out.println("Recorrido del árbol");
        arbol.recorridoInorden();


    }
}
