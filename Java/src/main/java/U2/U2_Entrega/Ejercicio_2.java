package U2.U2_Entrega;
//Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
//hay dentro de un número. Se recomienda usar long en lugar de int ya que el
//primero admite números más largos.
//
//Ejemplo 1:
//Por favor, introduzca un número entero positivo: 406783
//El 406783 contiene 4 dígitos pares y 2 dígitos impares.
//
//Ejemplo 2:
//Por favor, introduzca un número entero positivo: 3177840
//El 3177840 contiene 3 dígitos pares y 4 dígitos impares.

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo: ");
        long num = teclado.nextLong();
        int pares = 0;
        int impares = 0;

        while (num!=0) {
            if (num%2==0) {
                pares++;
            }
            else if (num%2!=0){
                impares++;
            }
            num = num/10;

        }
        System.out.println("En el número introducido hay "+pares+" dígitos pares.");
        System.out.println("En el número introducido hay "+impares+" dígitos impares.");
    }
}
