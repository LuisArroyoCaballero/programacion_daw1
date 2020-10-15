package U2.T3;
//Ejercicio3-3: Crea un programa que calcule y muestre la división de dos números reales de
//doble precisión introducidos por el usuario.

import java.util.Scanner;


public class Ejercicio3_3 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer número para la división: ");
        double num_1 = teclado.nextDouble();
        System.out.println("Introduzca un segundo número: ");
        double num_2 = teclado.nextDouble();
        System.out.println(num_1/num_2);
    }
}
