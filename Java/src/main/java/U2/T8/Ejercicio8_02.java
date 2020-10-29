package U2.T8;
//Actividad 8.2: Un centro educativo nos ha pedido que diseñemos una aplicación para
//calcular datos estadísticos de los alumnos. Se introducirán las edades de los elumnos hasta que una
//de ellas sea negativa. La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido
//su edad, y cuántos alumnos son mayores de edad.

import java.util.Scanner;

public class Ejercicio8_02 {
    public static void main (String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las edades de los alumnos, para salir introduzca un número negativo:");
        int edad = teclado.nextInt();
        int cont = 0;
        int media = 0;
        int mayoria = 0;

        while (edad > 0) {

            media = media + edad;

            if (edad >= 18) {
                cont++;
                mayoria++;
            }
            else if (edad < 18 && edad > 1) {
                cont++;
            }
            edad = teclado.nextInt();
        }
        System.out.println(media/cont);
        System.out.println(cont);
        System.out.println(mayoria);

    }
}
