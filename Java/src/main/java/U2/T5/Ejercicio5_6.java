package U2.T5;
//Ejercicio5-6: Crea un programa que contenga una constante llamada gravedad=9,8,
//solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
//Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

import java.util.Scanner;

public class Ejercicio5_6 {
    final double gravedad = 9.8;
    public static void main(String arg[]) {
        final double gravedad = 9.8;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un valor de tiempo: ");
        int tiempo = teclado.nextInt();
        if (tiempo <= 0) {
            System.out.println("Tiempo incorrecto");
        }
        else {
            System.out.println("La velocidad es "+ (gravedad*tiempo));
        }
    }
}
