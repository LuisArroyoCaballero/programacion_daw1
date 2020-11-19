package U3.T1;
//Actividad 1.6: Crear una función que, mediante un booleano, indique si el carácter que se pasa como
//parámetro de entrada corresponde con una vocal.

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
        //String lista = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        String lista = "aeiouAEIOU";
        if (lista.indexOf(c) >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
