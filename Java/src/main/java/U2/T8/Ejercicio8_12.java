package U2.T8;
//Actividad 8.12: Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay.
//Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

import java.util.Scanner;

public class Ejercicio8_12 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la primera nota: ");
        int calif = teclado.nextInt();
        int cont = 1;
        boolean suspenso= false;
        while (calif < 0 || calif > 10){
            System.out.println("ERROR. Introduzca un valor entre 0 y 10:");
            calif = teclado.nextInt();
        }

        while (cont!=5) {
            if (calif < 5 && calif >= 0) {
                suspenso=true;
            }
            cont++;
            System.out.println("Introduzca la siguiente nota:");
            calif = teclado.nextInt();
            while (calif < 0 || calif > 10){
                System.out.println("ERROR. Introduzca un valor entre 0 y 10:");
                calif = teclado.nextInt();
            }
        }
        if (suspenso==true){
            System.out.println("Hay al menos 1 suspenso.");
        }
        else {
            System.out.println("No hay ningun suspenso.");
        }
    }
}
