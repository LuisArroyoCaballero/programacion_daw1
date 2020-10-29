package U2.T8;
//Actividad 8.4: Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

import java.util.Scanner;

public class Ejercicio8_04 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = teclado.nextInt();
        int cont = 1;

        while (cont != (num+1)) {

            System.out.println(cont);
            cont++;

        }

    }
}
