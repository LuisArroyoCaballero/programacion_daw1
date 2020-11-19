package U3.T1;
//Actividad 9: Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores
//primos del número que se le pasa como parámetro

import java.util.Scanner;

public class Ejercicio1_9 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        divisores_primos(num);

    }

    public static void divisores_primos(int n){
        int cont = 0;
        System.out.print("Los divisores primos son: ");
        for (int i = 1; i<= n; i++) {
            if (n%i == 0) {
                if (es_primo(i)){
                    System.out.print(i+" ");;
                }
            }
        }
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
