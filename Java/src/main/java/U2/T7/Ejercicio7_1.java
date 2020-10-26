package U2.T7;
//Actividad 7.1 - Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.

import java.util.Scanner;

public class Ejercicio7_1 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer valor.");
        int a = teclado.nextInt();
        System.out.println("Introduzca un segundo valor.");
        int b = teclado.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
