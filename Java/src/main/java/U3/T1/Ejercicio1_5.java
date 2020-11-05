package U3.T1;
//Actividad 1.5: Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números.
//Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.

import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca un segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduzca un tercer número: ");
        int num3 = teclado.nextInt();

        System.out.println(mayor(mayor(num1,num2),num3));
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
