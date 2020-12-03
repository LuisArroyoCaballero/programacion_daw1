package U3.U3_Entregable;
//Ejercicio 3
//
//Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N filas y N columnas con número aleatorios entre 100 y 200.
//
//Mostrar dicho array y a continuación rotarlo 90 grados:
//
//Ejemplo:
//
//Introduce la dimensión del Array: 5

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main (String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la dimension del array: ");
        int dimension = teclado.nextInt();
        int[][] tabla =new int[dimension][dimension];
        int j;

        for (int i = 0; i < dimension; i++){
            for (j = 0; j < dimension; j++){
                tabla[i][j] = (int)(Math.random()*(200-100)+100);
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println(" ");
        }
        int[][] tabla_girada=Rotar(tabla,dimension);
        System.out.println(" ");
        for (int i = 0; i < dimension; i++){
            for (j = 0; j < dimension; j++){
                System.out.print(tabla_girada[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    public static int[][] Rotar(int[][] matriz, int n) {
        int[][] matriz_girada = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matriz_girada[i][j] = matriz[n - j - 1][i];
            }
        }

        return matriz_girada;
    }
}
