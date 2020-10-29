package U2.T8;
//Actividad 8.7: Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class Ejercicio8_07 {
    public static void main(String arg[]) {
        int cont = 1;
        int producto = 1;

        while (!(cont/2==10)) {
            producto = producto*cont;
            cont+=2;
        }
        System.out.println(producto);

    }
}
