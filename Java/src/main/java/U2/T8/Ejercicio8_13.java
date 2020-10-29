package U2.T8;
//Actividad 8.13:  Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

import java.util.Scanner;

public class Ejercicio8_13 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        int total = 0;


        while (total != 6) {
            total++;
            System.out.println("Introduzca la siguiente nota:");
            int nota = teclado.nextInt();
            while (nota < 0 || nota > 10) {
                System.out.println("ERROR. Introduzca un valor entre 0 y 10:");
                nota = teclado.nextInt();
            }
            if (nota < 4) {
                suspensos++;
            }
            else if (nota == 4) {
                condicionados++;
            }
            else if (nota >= 5) {
                aprobados++;
            }

        }
        System.out.println("Hay "+aprobados+" aprobados.");
        System.out.println("Hay "+suspensos+" suspensos.");
        System.out.println("Hay "+condicionados+" condicionados.");
    }
}
