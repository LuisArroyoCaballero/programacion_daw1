package U2.U2_Entrega;
//Realiza un programa que pinte por pantalla un rombo hueco hecho con
//asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
//sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
//mensaje de error y volverlo a pedir hasta que sea correcto.
//Ejemplo:
//Por favor, introduzca la altura del rombo: 5
//  *
// * *
//*   *
// * *
//  *

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura del rombo: ");
        int altura = teclado.nextInt();
        int i;
        int j;
        int blanc_izq = altura/2;
        int blanc_centro = -1;


        for (i=1 ; i<=altura/2 ; i++) {
            for (j=1 ; j <= blanc_izq ; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (j=1 ; j <= blanc_centro ; j++){
                System.out.print(" ");
            }
            if (i>1){
                System.out.print("*");
            }

            System.out.println(" ");
            blanc_centro = blanc_centro +2;
            blanc_izq = blanc_izq - 1;
        }

        System.out.print("*");
        for (j=1 ; j <= blanc_centro ; j++){
            System.out.print(" ");
        }
        System.out.println("*");
        blanc_centro = blanc_centro -2;
        blanc_izq = blanc_izq +1;


        for (i=1 ; i<=altura/2 ; i++) {
            for (j=1 ; j <= blanc_izq ; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (j=1 ; j <= blanc_centro ; j++){
                System.out.print(" ");
            }
            if (i<altura/2){
                System.out.print("*");
            }

            System.out.println(" ");
            blanc_centro = blanc_centro - 2;
            blanc_izq++;
        }
    }
}
