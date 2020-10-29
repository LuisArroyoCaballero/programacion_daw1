package U2.T8;
//Actividad 8.15: Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y
//n que sean primos. Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:
//
//1-> primo
//2->primo
//3->primo
//4->no primo
//5->primo
//6->no primo
//7->primo
//8->no primo
//
//Resultado del programa: Entre 1 y 8 hay 5 números primos.

import java.util.Scanner;

public class Ejercicio8_15 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n = teclado.nextInt();
        int i;
        int j;
        int primos = 2;


        for (i=3;i<=n;i++) {
            for (j=2;j<=(i-1);j++) {
                if (i%j==0){
                    primos++;
                    break;
                }

            }
        }
        System.out.println(primos);
    }
}
