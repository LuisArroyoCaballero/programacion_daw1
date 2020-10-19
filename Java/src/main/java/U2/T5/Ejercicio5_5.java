package U2.T5;
//Ejercicio5-5: Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.

import java.util.Scanner;

public class Ejercicio5_5 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer número: ");
        long num_1 = teclado.nextLong();
        System.out.println("Introduzca un segundo número: ");
        long num_2 = teclado.nextLong();
        System.out.println("Introduzca un tercer número: ");
        long num_3 = teclado.nextLong();

        if ((num_1 > num_2) && (num_1 > num_3)) {
            System.out.println("El primer número es el mayor de todos.");
        }
        else if ((num_2 > num_1) && (num_2 > num_3)) {
            System.out.println("El segundo número es el mayor de todos.");
        }
        else if ((num_3 > num_1) && (num_3 > num_2)) {
            System.out.println("El tercer número es el mayor de todos.");
        }
        else {
            System.out.println("Alguno de los números coinciden.");
        }
    }
}
