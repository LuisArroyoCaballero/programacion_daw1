package U2.T6;
//Ejercicio6-3: Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1
//si ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".

import java.util.Scanner;

public class Ejercicio6_3 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero.");
        int num = teclado.nextInt();
        int par_if = 1;

        if (num % 2 == 0) {
            par_if = 1;
        }
        else {
            par_if = 0;
        }

        int par_ternario = num % 2 == 0 ? 1 : 0 ;

        System.out.println(par_ternario);
        System.out.println(par_if);

    }
}
