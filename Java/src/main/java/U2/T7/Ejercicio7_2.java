package U2.T7;
//Actividad 7.2 - Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos".
//Necesitamos almacenar en la variable booleana "jasp" el valor:
//verdadero: Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
//falso: En caso contrario.
//escribe el código necesario para inicializar "jasp" en una línea.


import java.util.Scanner;

public class Ejercicio7_2 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = teclado.nextInt();
        System.out.println("Introduzca su nivel de estudios");
        int niv_estudios = teclado.nextInt();
        System.out.println("Introduzca sus ingresos: ");
        double ingresos = teclado.nextDouble();

        boolean jasp = edad <= 28 && niv_estudios > 3 && ingresos > 28000 ? true : false;
        System.out.println(jasp);
    }
}
