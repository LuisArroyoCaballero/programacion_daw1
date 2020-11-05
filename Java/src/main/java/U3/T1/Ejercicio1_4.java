package U3.T1;
//Actividad 1.4: Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.

import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String arg[]) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un primer número: ");
    int num1 = teclado.nextInt();
    System.out.println("Introduzca un segundo número: ");
    int num2 = teclado.nextInt();
    System.out.println(mayor(num1,num2));

    }
    public static int mayor(int n1,int n2){
        if (n1>n2){
            return n1;
        }
        else if (n2>n1) {
            return n2;
        }
        else {
            return n1;
        }
    }
}
