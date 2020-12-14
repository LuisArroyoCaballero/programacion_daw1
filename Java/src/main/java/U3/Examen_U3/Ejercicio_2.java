package U3.Examen_U3;
//Realiza un programa que rellene un array de 5 filas por 9 columnas con
//números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
//continuación, el programa deberá dar la posición tanto del máximo como del
//mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.

public class Ejercicio_2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][9];
        int a;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                a= (int) Math.random()*(1000-100+1)+100;
                while (filtra_repe(matriz,a)){
                    a= (int) Math.random()*(1000-100+1)+100;
                }
                matriz[i][j]=a;

            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static boolean filtra_repe(int[][] n,int x){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (x-cn[i][j]){

                    return false;
                }

            }
        }
        return true;
    }
}
