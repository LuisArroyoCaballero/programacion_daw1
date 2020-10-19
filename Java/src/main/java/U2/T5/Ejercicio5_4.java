package U2.T5;
//Ejercicio5-4: Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

import java.util.Scanner;

public class Ejercicio5_4 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer número: ");
        int num_1 = teclado.nextInt();
        System.out.println("Introduzca un segundo número: ");
        int num_2 = teclado.nextInt();

        if ((num_1 % 2 != 0) && (num_2 % 2 != 0)) {
            System.out.println("Ambos números impares.");
        }
        else if ((num_1 % 2 != 0) || (num_2 % 2 != 0)) {
            System.out.println("Uno de los números introducidos es par.");
        }
        else {
            System.out.println("Ambos números son positivos.");
        }
    }
}
