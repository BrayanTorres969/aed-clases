package pe.edu.utp.semana06.sesion01;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        char resp = 'S';
        while(resp=='S'){
            System.out.println("Ingrese un numero: ");
            int num=Leer.nextInt();
            System.out.println("¿Donde desea agregar el numero?: ");
            System.out.println("1.Al inicio \t2.Al final");
            int opcion=Leer.nextInt();
            if(opcion==1){
                lista.agregarInicio(num);
            }else{
                lista.agregarFinal(num);
            }
            System.out.println("¿Desea continuar? S/N: ");
            resp=Leer.next().charAt(0);
        }
        lista.mostrarElementos();
    }
}

