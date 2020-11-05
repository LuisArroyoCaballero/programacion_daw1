package U3.T1;
//Actividad 1.1: Diseñar una función eco() a la que se le pasa como parámetro un número n,
//y muestra por pantalla n veces el mensaje "Eco..."

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n = teclado.nextInt();
        int cont = 0;
        Eco(n,cont);
    }
    public static void Eco (int num,int cont) {
        while (num != cont) {
            System.out.println("Eco...");
            cont++;
        }

    }
}
