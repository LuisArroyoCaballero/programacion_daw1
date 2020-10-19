package U2.T6;
//Ejercicio6-2: Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
//Por ejemplo, si el usuario introduce 3, deberá escribir "tres".

import java.util.Scanner;

public class Ejercicio6_2 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intrduzca un número del 1 al 10.");
        int mes = teclado.nextInt();

        switch (mes) {
            case 1: System.out.println("Usted a introducido el número uno."); break;
            case 2: System.out.println("Usted a introducido el número dos."); break;
            case 3: System.out.println("Usted a introducido el número tres."); break;
            case 4: System.out.println("Usted a introducido el número cuatro."); break;
            case 5: System.out.println("Usted a introducido el número cinco."); break;
            case 6: System.out.println("Usted a introducido el número seis."); break;
            case 7: System.out.println("Usted a introducido el número siete."); break;
            case 8: System.out.println("Usted a introducido el número ocho."); break;
            case 9: System.out.println("Usted a introducido el número nueve."); break;
            case 10: System.out.println("Usted a introducido el número diez."); break;
            default: System.out.println("La próxima vez introduzca un número del 1 al 10.");

        }
    }
}
