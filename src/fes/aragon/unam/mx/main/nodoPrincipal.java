package fes.aragon.unam.mx.main;

import fes.aragon.unam.mx.clase.Nodo;

public class nodoPrincipal {
    public static void main(String[] args) {

        Nodo<Integer>head = new Nodo<>(100,new Nodo<>(200,new Nodo<>(300,new Nodo<>(400,new Nodo<>(600)))) );

        Nodo<Integer> nodoPeque = head;
        System.out.println("Primera corrida de la estructura:");


        while (nodoPeque !=null){
            System.out.print(nodoPeque.getDato()+"/->/");
            nodoPeque = nodoPeque.getSiguiente();


        }
        System.out.println("null/");

        head.getSiguiente().getSiguiente().setDato(333);
        Nodo<Integer> nodoPeque2 = head;
        System.out.println("Segunda corrida con el 300 a 333:");


        while (nodoPeque2 !=null){
            System.out.print(nodoPeque2.getDato()+"/->/");
            nodoPeque2 = nodoPeque2.getSiguiente();


        }
        System.out.println("null/");



        head.getSiguiente().getSiguiente().getSiguiente().
                getSiguiente().setSiguiente(new Nodo<>(700));

        Nodo<Integer> nodoPeque3 = head;
        System.out.println("Tercera corrida con 700 como ultimo dato:");


         while (nodoPeque3 !=null){
            System.out.print(nodoPeque3.getDato()+"/->/");
            nodoPeque3 = nodoPeque3.getSiguiente();


        }
        System.out.println("null/");
         Nodo<Integer>head2 = new Nodo<>();

         head2.setDato(50);
         head2.setSiguiente(head);
        Nodo<Integer> nodoPeque4 = head2;
        System.out.println("Cuarta corrida con 50 como primer dato:");


        while (nodoPeque4 !=null){
            System.out.print(nodoPeque4.getDato()+"/->/");
            nodoPeque4 = nodoPeque4.getSiguiente();


        }
        System.out.println("null/");





    }

}