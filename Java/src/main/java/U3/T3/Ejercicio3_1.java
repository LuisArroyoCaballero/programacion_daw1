package U3.T3;
//Actividad 1: Diseñar un programa que solicite al usuario 5 números decimales.
//A continuación, debe mostrar los números en el mismo orden en que se han introducido.

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        double[] datos = new double[5];

        for (int i = 0; i <= 4 ; i++){
            System.out.println("Introduzca un primer número: ");
            datos[i] = teclado.nextDouble();

        }
        for (int i = 0; i < datos.length ; i++){
            System.out.print(datos[i]+" ");

        }
    }
}
