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
        System.out.println("Introduzca un segundo número.");
        byte num_2 = teclado.nextByte();
        int menor_if = 0;
        int menor_condicional;

        if (num_1 == num_2) {
            System.out.println("Los dos números son iguales.");
        }
        else if (num_1 < num_2) {
            menor_if = num_1;
            System.out.println(menor_if);
        }
        else {
            menor_if = num_2;
            System.out.println(menor_if);
        }

        menor_condicional = num_1 < num_2 ? num_1 : num_2;
        System.out.println(menor_condicional);


    }
}
