package pe.edu.utp.semana06.sesion01;

public class ListaEnlazada {
    private Nodo inicio, fin;
    public ListaEnlazada() {
        inicio = null;
        fin = null;
    }
    public void agregarInicio(int dato){
        inicio=new Nodo(dato,inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    public void agregarFinal(int dato){
        if(estaVacio()){
            inicio=fin=new Nodo(dato);
        }else{
            fin.setSiguienteNodo(new Nodo(dato));
            fin=fin.getSiguienteNodo();
        }
    }

    private boolean estaVacio() {
        return (inicio==null);
    }

    //Método para mostrar elementos de la lista enlazada
    public void mostrarElementos(){
        Nodo elemento=inicio;
        System.out.println();
        while(elemento != null){
            System.out.print(elemento.getDato()+"-->");
            elemento=elemento.getSiguienteNodo();
        }
        System.out.println();
    }
}
