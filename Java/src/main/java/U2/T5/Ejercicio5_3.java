package U2.T5;
//Ejercicio5-3: Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

import java.util.Scanner;

public class Ejercicio5_3 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = teclado.nextInt();

        if ((num % 2 == 0) && (num != 0)) {
            System.out.println("El número "+num+" es par.");
        }
        else if (num == 0) {
            System.out.println("El número introducido es el 0.");
        }
        else {
            System.out.println("El número "+num+ " es impar");
        }

    }
}
