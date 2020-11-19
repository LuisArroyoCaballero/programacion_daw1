package U3.T2;
//Actividad 1: Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando
//las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra introducida
//sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas.
//La cadena "fin" no aparecerá en la frase final.


import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca palabras para crear una frase, para finalizar introduzca fin.");
        String Palabra = teclado.nextLine();
        String fin="fin";
        String frase = "";

        while (!(Palabra.equalsIgnoreCase(fin))){
            frase = frase + Palabra + " ";
            Palabra = teclado.nextLine();
        }

        System.out.println(frase);

    }
}
