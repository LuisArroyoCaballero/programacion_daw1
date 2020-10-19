package U2.T6;
//Ejercicio6-4: Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
//que tenga el valor del menor de esos dos números.
//Hazlo primero con un "if" y luego con un "operador condicional".

import java.util.Scanner;

public class Ejercicio6_4 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer número.");
        byte num_1 = teclado.nextByte();
        System.out.println("Introduzca un primer número.");
        byte num_2 = teclado.nextByte();


    }
}
