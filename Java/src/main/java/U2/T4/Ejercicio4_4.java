package U2.T4;
//Actividad 4.4 - Sería interesante disponer de un programa que pida como entrada un número decimal y
//lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5

import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número con decimales: ");
        float num = teclado.nextFloat();
        System.out.println("El número redondeado sería: "+Math.round(num));

    }
}
