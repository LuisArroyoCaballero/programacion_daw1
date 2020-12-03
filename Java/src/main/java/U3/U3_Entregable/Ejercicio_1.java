package U3.U3_Entregable;
//Ejercicio 1
//
//Crea la función filtraPrimos que:
//
//Recibe un array de enteros
//Devuelve un array de enteros con todos los primos que se encuentran en el array origen
//Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se pasa como parámetro.
//Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector.
//Si no existe ningún número primo en el vector original, se devuelve un array con el número -1 como único elemento.

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la dimension del array: ");
        int n = teclado.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++){
            System.out.println("Introduzca un valor: ");
            array[i]=teclado.nextInt();
        }
        int[] primos= filtraPrimos(array,n);
        for (int i=0; i < primos.length; i++){
            System.out.println(primos[i]);
        }

    }

    public static int[] filtraPrimos(int[] array,int n){
        int[] primos = new int[n];
        int cont = 0;
        for (int i = 0; i < n; i++){
            if (es_primo(array[i])){
                primos[cont]=array[i];
                cont++;

            }

        }
        if (cont==0){
            primos[0]=-1;
            cont++;
        }
        int[] primos2=new int[cont];
        if (cont >= 0) {
            System.arraycopy(primos, 0, primos2, 0, cont);
        }

        return primos2;
    }
    public static boolean es_primo(int n){
        if (n == 1 || n == 0) {
            return false;
        }

        for (int i = 2; i <= n-1; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
