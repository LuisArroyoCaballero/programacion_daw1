package U3.T1;
//Actividad 12: Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.

import java.util.Scanner;

public class Ejercicio1_12 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero para calcular su factorial: ");
        int numero = sc.nextInt();

        System.out.println(factorial(numero));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        else if (n == 1) {
            return n;
        }
        else {
            return n*factorial((n-1));
        }
    }
}
