package U2.T8;
//Actividad 8.14: Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n=4:
//
//****
//***
//**
//*

import java.util.Scanner;

public class Ejercicio8_14 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura de la figura:");
        int n = teclado.nextInt();
        int i;
        int j;
        int blanc = 1;

        for (i=1 ; i<=n ; i++){
            for (j=blanc ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println("");
            blanc++;
        }


    }
}
