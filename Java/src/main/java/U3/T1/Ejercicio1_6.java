package U3.T1;
//Actividad 1.6: Crear una funci�n que, mediante un booleano, indique si el car�cter que se pasa como
//par�metro de entrada corresponde con una vocal.

import java.util.Scanner;

public class Ejercicio1_6 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una letra.");
        String caracter = teclado.nextLine();

        if (vocal(caracter)){
            System.out.println("La letra es vocal.");
        }
        else {
            System.out.println("La letra es consonante.");
        }
    }
    public static boolean vocal(String c){
        //String lista = "aeiouAEIOU����������";
        String lista = "aeiouAEIOU";
        if (lista.indexOf(c) >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
