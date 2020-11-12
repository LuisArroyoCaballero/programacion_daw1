package U2.U2_Entrega.U2_Examen;
//Ejercicio 1
//Escribe un programa que lea un número n e imprima una pirámide de letras
//con n filas como en la siguiente figura:
//abcdcba
// abcba
//  aba
//   a

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor introduzca unas cuantas de letras");
        String cadena = teclado.nextLine();
        int i = 0;
        int j = 0;
        int blanc_izq = 0;
        int letra = 0;
        int grosor = cadena.length();

        for (i=0; i<= (cadena.length()-1); i++) {
            for (j=0; j<= blanc_izq; j++){
                System.out.print(" ");

            }


            for (j=0; j<= (grosor-2); j++){

                System.out.print(cadena.charAt(letra));
                letra++;


            }
            System.out.print(cadena.charAt(letra));




            for (j=0; j<= (grosor-2); j++) {

                letra--;
                System.out.print(cadena.charAt(letra));


            }
            grosor--;
            blanc_izq++;
            System.out.println(" ");
        }

    }
}
