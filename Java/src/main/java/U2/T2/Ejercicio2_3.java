package U2.T2;
//Ejercicio2-3: Crea un programa que calcule y muestre la división de
//dos números enteros introducidos por el usuario.
import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el primer número: ");
        int primer_numero = teclado.nextInt();
        System.out.println("Escriba el segundo número: ");
        int segundo_numero = teclado.nextInt();

        System.out.println("El resultado de la división de los dos numeros es: ");
        System.out.println(primer_numero/segundo_numero);
    }
}
