package U2.T8;
//Actividad 8.5: Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
//A continuación, solicitará por teclado un valor que debe estar dentro del rango.
//Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

import java.util.Scanner;

public class Ejercicio8_05 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introdzuca el mínimo del rango:");
        int min = teclado.nextInt();
        System.out.println("Introduzca un máximo del rango:");
        int max = teclado.nextInt();
        System.out.println("Ahora introduzca un número que este dentro de ese rango:");
        int num = teclado.nextInt();

        while (!(num >= min && num <= max)) {
            System.out.println("Error. Vuelva a intertarlo.");
            num = teclado.nextInt();
        }
        System.out.println("Bien hecho.");
    }
}
