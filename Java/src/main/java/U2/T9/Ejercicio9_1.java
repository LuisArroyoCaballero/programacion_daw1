package U2.T9;
//Actividad 9.1: Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.

import java.util.Scanner;

public class Ejercicio9_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una primera palabra: ");
        String a = teclado.nextLine();
        System.out.println("Introduzca una segunda palabra: ");
        String b = teclado.nextLine();
        if (a.length() > b.length()){
            System.out.println( b+ " es más corta ");
        }else if (b.length() > a.length()) {
            System.out.println( a + " es la mas corta " );
        }
        else {
            System.out.println("Las dos palabras tienen el mismo número de carácteres.");
        }




    }
}