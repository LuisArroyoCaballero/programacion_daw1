package U2.T2;
//Ejercicio2-5: Crea un programa que pida al usuario una temperatura en grados centígrados y
//calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).

import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de grados centigrados: ");
        int centigrados = teclado.nextInt();

        System.out.println("La cantidad equivalente en grados Fahrenheit es: ");
        System.out.println((centigrados*9/5)+32);
    }
}
