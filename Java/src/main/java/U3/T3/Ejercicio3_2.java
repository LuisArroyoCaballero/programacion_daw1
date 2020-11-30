package U3.T3;
//Actividad 2: Escribir una aplicación que solicite al usuario cuántos números desea introducir.
//A continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los mostrará
//en el orden inverso al introducido.

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que desea introducir: ");
        int longitud = teclado.nextInt();
        int[] datos = new int[longitud];

        for (int i = 0; i < longitud; i++){
            System.out.println("Introduzca el primer numero: ");
            datos[(longitud-1)-i] = teclado.nextInt();
        }
        for (int i = 0; i < longitud ; i++){
            System.out.print(datos[i]+" ");

        }

    }
}
