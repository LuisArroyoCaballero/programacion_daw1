package U2.T8;
//Actividad 8.3: Realizar un aplicación que genere un número aleatorio entre 1 y 100.
//El jugador debe ir probando números tratando de acertarlo. El programa debe indicar "mayor" o "menor"
//según el número secreto sea mayor o menor que el introducido por el usuario.
//El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).

import java.util.Scanner;

public class Ejercicio8_03 {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);
        double double_random = Math.floor(Math.random() * (100)) + 1;
        int int_random = (int) double_random;
        System.out.println("Comienza el juego, para rendirte introduzca -1.");
        int pl_try = teclado.nextInt();


        while (pl_try != -1) {

            if (pl_try < int_random) {
                System.out.println("El número secreto es mayor, prueba otra vez.");
            }
            else if (pl_try > int_random) {
                System.out.println("El número secreto es menor, prueba otra vez.");
            }
            else if (pl_try == int_random) {
                break;
            }
            pl_try = teclado.nextInt();
        }
        System.out.println("Juego terminado.");
    }
}
