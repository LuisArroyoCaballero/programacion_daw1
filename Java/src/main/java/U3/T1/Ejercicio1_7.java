package U3.T1;
//Actividad 1.7: Diseñar una función que nos diga si un número es primo.

import java.util.Scanner;

public class Ejercicio1_7 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        System.out.println(es_primo(num));

    }

    public static boolean es_primo(int n){
        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i <= n-1; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
