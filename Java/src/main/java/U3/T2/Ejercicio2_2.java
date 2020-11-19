package U3.T2;
//Actividad 2: Diseñar una actividad que pida al usuario que introduzca una frase por
//teclado e indique cuántos espacios en blanco tiene.

import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = teclado.nextLine();
        String espacio = " ";
        int i;
        int numero_espacios = 0;

        for (i = 0; i < frase.length(); i++){
            if ((frase.substring(i,i+1)).equals(espacio)){
                numero_espacios=numero_espacios+1;
            }
        }
        System.out.println(numero_espacios);


    }
}
