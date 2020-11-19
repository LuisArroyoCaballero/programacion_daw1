package U3.T1;
//Actividad 10: Escribir una función que decida si dos números enteros positivos son amigos.
//Dos números son amigos si la suma de los divisores propios (distinto de él mismo) del primer número es igual
//al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)

import java.util.Scanner;

public class Ejercicio1_10 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer número");
        int numero_1 = teclado.nextInt();
        System.out.println("Introduzca un segundo número");
        int numero_2 = teclado.nextInt();

        amigos(numero_1, numero_2);

    }

    public static void amigos(int num1, int num2){
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 1; i<= num1-1; i++) {
            if (num1%i == 0) {
                suma1 = suma1 + (i);
            }
        }
        for (int i = 1; i<= num2-1; i++) {
            if (num2%i == 0) {
                suma2 = suma2 + (i);
            }
        }
        if (num1==suma2 && num2==suma1){
            System.out.println("Estos dos números son amigos.");
        }
        else {
            System.out.println("Estos dos números no son amigos.");
        }
    }
}
