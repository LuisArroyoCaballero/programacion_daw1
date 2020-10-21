package U2.T6;
//Ejercicio6-5: Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia,
//y a continuación muestre un pequeño menú con 3 opciones:
//1.Calcular diámetro
//2.Calcular perímetro
//3.Calcular área
//Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
//(diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio6_5 {
    public static void main(String arg[]) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el radio de la circunferencia ");
    double radio = teclado.nextDouble();
    System.out.println("Para saber el diámetro de la circunferencia pulse: 1");
    System.out.println("Para saber el perímetro de la circunferencia pulse: 2");
    System.out.println("Para saber el área de la circunferencia pulse: 3");
    int opcion = teclado.nextInt();

    switch (opcion) {
        case 1: System.out.println(2*radio);break;
        case 2: System.out.println(2*Math.PI*radio);break;
        case 3: System.out.println(Math.PI*radio*radio);break;
        default: System.out.println("Introduzca una opción valida.");break;
    }

    }
}
