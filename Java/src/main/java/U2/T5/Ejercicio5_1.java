package U2.T5;
//Ejercicio5-1: Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero)
//o si, por el contrario, no lo es (usando "else").

import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = teclado.nextInt();
        if (num > 0) {
            System.out.println("El numero "+num+" es positivo.");
        }
        else {
            System.out.println("El numero introducido es negativo o 0.");
        }
    }
}
