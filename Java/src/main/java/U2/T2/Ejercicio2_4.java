package U2.T2;
//Ejercicio2-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
//y calcule su equivalencia en metros (1 milla = 1609 m).

import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzzca el número de milals a cambiar a metros" );
        int millas = teclado.nextInt();
        int resultado = (millas*1609);
        System.out.println("La cantidad en metros es: ");
        System.out.println(resultado);
    }


}
