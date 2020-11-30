package U3.T3;
//Actividad 3: Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
//Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros que desea introducir: ");
        int longitud = teclado.nextInt();
        int[] datos = new int[longitud];
        int ceros = 0;
        int positivos = 0;
        int positivos_cont = 0;
        int negativos_cont = 0;
        int negativos = 0;

        for (int i = 0; i <= longitud-1; i++){
            System.out.println("Introduzca un numero: ");
            datos[i] = teclado.nextInt();
            if (datos[i] == 0){
                ceros++;
            }
            if (datos[i] < 0) {
                negativos = negativos + datos[i];
                negativos_cont++;
            }
            if (datos[i] > 0) {
                positivos = positivos + datos[i];
                positivos_cont++;
            }
        }
        System.out.println("La cantidad de ceros introducidos es "+ceros);
        System.out.println("La media de los numeros positivos introducidos es "+positivos/positivos_cont);
        System.out.println("La media de los numeros positivos introducidos es "+negativos/negativos_cont);

    }
}
