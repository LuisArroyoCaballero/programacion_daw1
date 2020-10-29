package U2.T8;
//Actividad 8.1: Diseñar un programa que muestre, para cada número introducido por teclado,
//si es par, si es positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.

import java.util.Scanner;

public class Ejercicio8_01 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número, para terminar, pulse 0:");
        int num = teclado.nextInt();
        while (num != 0) {
            if (num % 2== 0) {
                System.out.println("El número es par.");
            }
            else {
                System.out.println("El número es impar.");
            }
            if (num > 0) {
                System.out.println("El número es positivo.");
            }
            else {
                System.out.println("El número es negativo o 0");
            }
            System.out.println(num*num);
            System.out.println("Introduzca el siguiente número:");
            num = teclado.nextInt();
        }
        System.out.println("Fin del proceso.");
    }
}
