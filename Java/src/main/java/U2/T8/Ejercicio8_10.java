package U2.T8;
//Actividad 8.10: Implementar una aplicación que pida un número al usuario entre el 1 y el 10,
//y calcule su tabla de multiplicar. El código debe asegurarse de que el número introducido está entre 1 y 10,
//y si no es así, volver a pedirlo hasta que lo cumpla.

import java.util.Scanner;

public class Ejercicio8_10 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número del 1 al 10.");
        int num = teclado.nextInt();
        int cont = 0;
        while (!(num >= 1 && num<=10)) {
            System.out.println("El número se tiene que encontrar entre 1 y 10.");
            num = teclado.nextInt();
        }
        while (!(cont == 11)) {
            switch (num) {
                case 1:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 2:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 3:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 4:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 5:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 6:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 7:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 8:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 9:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
                case 10:
                    System.out.println(num + "*" + cont + "=" + (num * cont));
                    cont++;
                    break;
            }
        }
    }
}
