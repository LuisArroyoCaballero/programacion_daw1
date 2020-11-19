package U3.T2;
//Actividad 3: Pedir el nombre completo (nombre y apellidos) al usuario.
//El programa debe eliminar cualquier vocal del nombre. Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz".
//Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main (String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nombre completo: ");
        String nombre = teclado.nextLine();
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        int i;
        String sin_vocales = "";


        for (i=0; i < nombre.length(); i++) {
            if (vocales.indexOf(nombre.substring(i,i+1)) >= 0) {
                continue;
            }
            else {
                sin_vocales = sin_vocales + nombre.substring(i,i+1);
            }
        }
        System.out.println(sin_vocales);

    }
}
