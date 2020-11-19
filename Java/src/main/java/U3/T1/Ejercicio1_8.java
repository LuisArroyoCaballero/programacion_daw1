package U3.T1;
//Actividad 8: Escribir una función a la que se le pase un número entero y
//devuelva el número de divisores primos que tiene.

import java.util.Scanner;

public class Ejercicio1_8 {
    public static void main (String arg[]) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        System.out.println(divisores_primos(num));

    }

    public static int divisores_primos(int n){
        int cont = 0;
        for (int i = 1; i<= n; i++) {
            if (n%i == 0) {
                if (es_primo(i)){
                    cont++;
                }
            }
        }
        return cont;
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
