package U2.T3;
//Ejercicio3-2: Crea un programa que pida al usuario su año de nacimiento y el año actual
//(usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su año de nacimiento: ");
        short nacimiento = teclado.nextShort();
        System.out.println("Introduzca el año actual: ");
        short actual = teclado.nextShort();
        System.out.println("Su edad es o "+(actual-nacimiento-1)+" o "+(actual-nacimiento)+" años.");
    }
}
