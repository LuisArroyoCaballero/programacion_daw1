package U2.T3;
//Ejercicio3-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y
//calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cantidad de millas: ");
        float millas = teclado.nextFloat();
        System.out.println("La cantidad en kilómetros es: "+ (millas*1609));

    }
}
