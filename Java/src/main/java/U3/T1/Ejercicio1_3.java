package U3.T1;
//Actividad 1.3: Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
//Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
//Además, hemos de pasarle a la función el radio de la base y la altura.

import java.lang.Math;
import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el radio del cilindro: ");
        double radio = teclado.nextDouble();
        System.out.println("Introduzca la altura del cilindro: ");
        double altura = teclado.nextDouble();
        System.out.println("Para calcular el área introduzca 1, para el volumen introduzca 2:");
        int opcion = teclado.nextInt();

        Area_vs_Volumen(opcion,radio,altura);

    }
    public static void Area_vs_Volumen (int opcion,double r, double h){
        if (opcion == 1){
            System.out.println(2*Math.PI*r*(h+r));
        }
        else if (opcion == 2){
            System.out.println(Math.PI*Math.pow(r,2)*h);
        }
        else {
            System.out.println("Opción inválida.");
        }

    }
}
