package U3.T1;
//Actividad 1.2: Diseñar una  función a la que se le pasen dos enteros
//y muestre todos los números comprendidos entre ellos.

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer número: ");
        int n_1 = teclado.nextInt();
        System.out.println("Introduzca un segundo número: ");
        int n_2 = teclado.nextInt();

        comprendidos(n_1,n_2);

    }
    public static void comprendidos(int num_1,int num_2){
        while (num_1!=(num_2-1)){
            num_1++;
            System.out.println(num_1);
        }
    }
}
