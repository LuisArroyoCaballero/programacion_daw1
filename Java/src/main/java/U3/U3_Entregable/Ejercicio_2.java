package U3.U3_Entregable;
//Ejercicio 2
//
//Crea una función con la siguiente cabecera:
//
//public String convierteEnMorse(int n)
//
//Esta función convierte el número n al sistema Morse y lo devuelve en una
//cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
//Morse. Utiliza esta función en un programa para comprobar que funciona bien.
//Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
//desde el programa principal.
//
//1 . _ _ _ _ 6 _ . . . .
//2 . . _ _ _ 7 _ _ . . .
//3 . . . _ _ 8 _ _ _ . .
//4 . . . . _ 9 _ _ _ _ .
//5 . . . . . 0 _ _ _ _ _

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        System.out.println(convierteEnMorse(n));
    }



    public static String convierteEnMorse(int n) {

        int n_long = n;
        int cont = 0;
        double divisor = 1;

        while (n_long != 0) {
            n_long = n_long / 10;
            cont++;

        }
        int[] array = new int[cont];
        int i=0;
        while (n > 0) {

            array[(cont-1)-i]=n % 10;
            n = n / 10;
            i++;
        }



        String morse="";
        for ( i = 0; i < cont; i++) {
            if ( array[i]== 0) {
                morse = morse+("_ _ _ _ _ ");
            }
            if (array[i]  == 1) {
                morse = morse+(". _ _ _ _ ");
            }
            if (array[i] == 2) {
                morse = morse+(". . _ _ _ ");
            }
            if (array[i] == 3) {
                morse = morse+(". . . _ _ ");
            }
            if (array[i]  == 4) {
                morse = morse+(". . . . _ ");
            }
            if (array[i]  == 5) {
                morse = morse+(". . . . . ");
            }
            if (array[i]  == 6) {
                morse = morse+("_ . . . . ");
            }
            if (array[i]  == 7) {
                morse = morse+("_ _ . . . ");
            }
            if (array[i] == 8) {
                morse = morse+("_ _ _ . . ");
            }
            if (array[i] == 9) {
                morse = morse+ "_ _ _ _ . " ;
            }



        }
        return morse;
    }
}
