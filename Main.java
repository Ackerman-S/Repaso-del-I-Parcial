package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);


        int producto,sub=0;
        System.out.println("Ingrese cantidad de productos");
        producto=teclado.nextInt();

        if(producto<=2){
            System.out.println("NO APLICA DESCUENTOS");
        }

        if(producto>=3 && producto<=5){
            System.out.println("SE LE APLICA EL 5% DE DESCUENTO");
        }

        if(producto>5){
            sub=producto*70;
            if(sub>=300 && sub<=999){
                System.out.println("SE LE APLICA EL 10% DE DESCUENTO");
            }
        }

        if(producto>5){
            sub=producto*70;
            if(sub>=1000){
                System.out.println("SE LE APLICA EL 20% DE DESCUENTO");
            }
        }

  





    }
}
