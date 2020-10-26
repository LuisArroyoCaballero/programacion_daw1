package U2.T7;
//Actividad 7.3 - Realiza un programa que genere una letra minúscula de forma aleatoria.
//Investiga el uso de la función Math.random().
//Investiga también sobre el sistema de codificación ASCII y ten en cuenta que las letras minúsculas se corresponden
//con los números del 97 al 122.

import java.lang.Math;

public class Ejercicio7_3 {
    public static void main(String arg[]) {
        double random = Math.floor(Math.random() * (26)) + 97;

        char minuscula = (char) random;

        System.out.println(minuscula);
    }

}
