package U2.T5;
//Ejercicio5-2: Crea un programa que pida al usuario que introduzca el número 12.
//Después debe decirle si lo ha hecho correctamente o no.

import java.util.Scanner;

public class Ejercicio5_2 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número 12: ");
        int num = teclado.nextInt();

        switch (num) {
            case 12: System.out.println("Ha acertado."); break;
            default: System.out.println("No ha introducido el numero 12.");
        }
    }
}
