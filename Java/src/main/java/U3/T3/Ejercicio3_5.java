package U3.T3;
//Actividad 5: Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
//Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera, de
//forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden correcto para que los
//datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una serie de numeros: ");
        String serie_1 = teclado.nextLine();
        int[] array_1 = new int[serie_1.length()];
        System.out.println("Introduzca otra serie de numeros: ");
        String serie_2 = teclado.nextLine();
        int[] array_2 = new int[serie_2.length()];
        int i,j;
        int k = 0;

        for ( i = 0; i < serie_1.length(); i++) {
            array_1[i] = Integer.parseInt(serie_1.substring(i,i+1));

        }
        Arrays.sort(array_1);
        System.out.println(Arrays.toString(array_1));

        for ( j = 0; j < serie_2.length(); j++) {
            array_2[j] = Integer.parseInt(serie_2.substring(j,j+1));
        }
        Arrays.sort(array_2);
        System.out.println(Arrays.toString(array_2));

        int[] array_3 = new  int[(serie_1.length()+serie_2.length())];

        i = 0;
        j = 0;

        while (i < array_1.length && j < array_2.length){
            if (array_1[i] < array_2[j]){
                array_3[k++]=array_1[i++];
            }
            if (array_1[i] > array_2[j]){
                array_3[k++]=array_2[j++];
            }
            if (array_1[i] == array_2[j]){
                array_3[k++] = array_2[j++];
            }
            if (i == array_1.length) {
                while (j != array_2.length) {
                    array_3[k++] = array_2[j++];
                }
            }

            if (j == array_2.length){
                while (i!=array_1.length){
                    array_3[k++] = array_1[i++];
                }
            }
        }
        System.out.println(Arrays.toString(array_3));


    }
}
