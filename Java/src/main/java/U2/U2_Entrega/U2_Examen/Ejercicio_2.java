package U2.U2_Entrega.U2_Examen;
//Ejercicio 2
//Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
//con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
//convertir un entero en un carácter.

import java.lang.Math;

public class Ejercicio_2 {
    public static void main(String arg[]) {
        int i;
        int j;


        for (i=0 ; i <= 1 ; i--){
            for (j=0; j <= 200 ; j++) {
                int random = (int)(Math.random()*95);
                char random_letra = (char)(random);
                System.out.print(random_letra);
            }
            System.out.println(" ");
        }
    }
}
