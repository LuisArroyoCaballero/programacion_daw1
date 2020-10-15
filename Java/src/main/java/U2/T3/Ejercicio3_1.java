package U2.T3;
//Ejercicio3-1: Crea un programa que calcule y muestre la suma de dos números de dos
//cifras (de tipo byte) que introduzca el usuario.

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer número a sumar: ");
        byte primer_num = teclado.nextByte();
        System.out.println("Introduzca el segundo número a sumar: ");
        byte segun_num = teclado.nextByte();
        System.out.println("La suma de los dos números es: ");
        System.out.println(primer_num+segun_num);
    }
}
