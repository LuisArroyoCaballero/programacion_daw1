package U3.T1;
//Actividad 11: Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
//Realizar una versión iterativa y otra recursiva.

import java.util.Scanner;

public class Ejercicio1_11 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor a elevar: ");
        int base = sc.nextInt();
        System.out.println("Introduzca el exponente: ");
        int exponente = sc.nextInt();

        System.out.println(elevado(base,exponente));
        System.out.println(elevado_recursiva(base,exponente));

    }
    public static double elevado(double a, int n){
        double elevado = 1;
        for (int i = 1; i <= n; i++){
            elevado = elevado * a;
        }
        return elevado;
    }

    public static double elevado_recursiva(double a, int n) {
        if (n == 1) {
            return a;
        }
        else if (n == 0) {
            return 1.0;
        }
        else {
            return a*elevado_recursiva(a,(n-1));
        }
    }
}
