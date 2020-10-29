package U2.T8;
//Actividad 8.8: Pedir un número y calcular su factorial.
//
//Ejemplo: Factorial de 5:
//
//5! = 5x4x3x2x1 = 120

import java.util.Scanner;

public class Ejercicio8_08 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int num = teclado.nextInt();
        int cont = 1;
        int factorial = 1;
        int i;

        for (i=cont;i<=num;i++) {
            factorial=factorial*cont;
            cont++;
        }
        System.out.println(factorial);
    }
}
