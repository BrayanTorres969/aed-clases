package pe.edu.utp.semana09.sesion02.service;

public class Cola {
    private Nodo inicio;
    private Nodo fin;
    private int cantidad;
    //Metodo constructor
    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.cantidad = 0;
    }

    //Métodos get y set
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    //Verificar si la cola está vacía
    public boolean vacia() {
        return inicio==null && fin == null;
    }
    //Agregar elementos al final de la cola (encolar)
    public void encolar(Object dato) {
        if(vacia()) {
            inicio=fin=new Nodo(dato,null);
        }else {
            Nodo nuevo = new Nodo(dato, null);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        cantidad++;
    }
    //Quitar o desencolar un elemento del frente de la cola
    public void desencolar() {
        if(!vacia()) {
            if((inicio==fin)) {
                inicio=fin=null;
            }else {
                inicio=inicio.getSiguiente();
            }
            cantidad--;
        }
    }
    //Eliminar un elemento de cualquier parte de la cola
    public void eliminar(Object dato) {
        if(!vacia()) {
            Cola aux=new Cola();
            while(!vacia()) {
                if(!inicio.getDato().equals(dato)) {
                    aux.encolar(inicio.getDato());
                }
                desencolar();
            }
            inicio=aux.getInicio();
            fin=aux.getFin();
            cantidad=aux.getCantidad();
        }
    }

    //Metodo para mostrar elementos de la cola
    public String mostrar() {
        String salida="";
        if(!vacia()) {
            Nodo aux = inicio;
            while(aux!=null) {
                salida += aux.getDato()+" \n";
                aux = aux.getSiguiente();
            }
        }
        return salida;
    }
}
