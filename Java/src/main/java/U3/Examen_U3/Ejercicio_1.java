package U3.Examen_U3;
//Implementa una función con nombre subcorteza que sea capaz de extraer la capa siguiente a la exterior de un array bidimensional. Esta capa se extrae en forma de array de una dimensión. La extracción de números comienza en la esquina superior izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar tanto el código de la función como el código de prueba que la usa. La cabecera de la función es la siguiente:
//
//public static int[] subcorteza(int[][] n)
//
//Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
//
//45 92 14 20 25 78
//35 72 24 45 42 60
//97 65 83 71 36 12
//32 42 64 23 41 39
//98 45 94 11 18 48
//
//El array unidimensional generado por subcorteza(a) sería el siguiente:
//
//72 24 45 42 36 41 23 64 42 65


import java.util.Arrays;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int[][] matriz= new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j]= (int)(Math.random()*(200-100+1)+100);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println(Arrays.toString(subcorteza(matriz)));
    }
    public static int[] subcorteza(int[][] n) {
        int[] array= new int[((n.length-4)+(n.length-4)+((n[1].length-2))+((n[1].length-2)))];
        int i=1,j=1,k=0;


        while ( k != (array.length/2)+1 ) {
            if (i == 1  && j < n.length-2){
                array[k++]=n[i][j++];
                continue;
            }
            if (i < n[j].length-1  && j == n.length-2 ){
                array[k++]=n[i++][j];


            }
        }
        i--;
        while ( k != array.length ) {
            if (i==n[j].length-2 && j > 1){
                array[k++]=n[i][--j];
            }
            if (i > 1 && j == 1){
                array[k++]=n[--i][j];

            }
        }
        return array;
    }
}
