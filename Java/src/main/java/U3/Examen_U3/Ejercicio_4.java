package U3.Examen_U3;
//Define la función convierteStringEnArray con la siguiente cabecera:
//
//public static int[] convierteArrayEnString(String a)
//
//Esta función toma como parámetro un String que solamente contiene números y devuelve una array con las cifras que contiene el número. Por ejemplo,
//
//si a = "", convierteStringEnArray(a) devuelve un array sin elementos;
//
//si a = "8", convierteStringEnArray(a) devuelve un array con el número 8;
//
//si a = "62501", convierteStringEnArray(a) devuelve un array tal como { 6, 2, 5, 0, 1 }.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        System.out.println(Arrays.toString(convierteStringenArray(cadena)));





    }
    public static int[] convierteStringenArray(String a) {
        int[] array = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            array[i]=  Integer.parseInt(a.substring(i,i+1));
        }
        return array;
    }
}
