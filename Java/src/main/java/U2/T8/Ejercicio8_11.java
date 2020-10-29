package U2.T8;
//Actividad 8.11: Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

public class Ejercicio8_11 {
    public static void main(String arg[]) {
        int multiplo_1 = 1;
        int multiplo_2 = 1;
        int i;
        int j;

        for (i = 1 ; i <= 10 ; i++) {
            System.out.println("");
            System.out.println("");
            System.out.println("Tabla del "+multiplo_1);
            System.out.println("");

            for (j = 1 ; j <= 10 ; j++) {
                System.out.println(multiplo_1 + "*" + multiplo_2 + "=" + (multiplo_1 * multiplo_2));
                multiplo_2++;
            }
            multiplo_1++;
            multiplo_2 = 1;
        }
    }
}
