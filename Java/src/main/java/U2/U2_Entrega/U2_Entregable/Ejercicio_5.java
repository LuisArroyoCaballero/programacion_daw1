package U2.U2_Entrega.U2_Entregable;
//Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
//abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
//Las vocales abiertas son a, e, o.
//
//Ejemplo:
//Entrada: cad = "Hipólito el Anodo"
//Salida: La cantidad de espacios, haches y vocales abiertas es 9

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto: ");
        String cad = teclado.nextLine();
        int cont = 0;
        int num_req = 0;
        int cadletra = cad.charAt(cont);

        while (cont!=(cad.length())) {
            cadletra = cad.charAt(cont);

            if (cadletra ==32 || cadletra == 65 || cadletra == 69 || cadletra == 72 || cadletra == 79 || cadletra == 97 || cadletra == 101 || cadletra == 104 || cadletra == 111 || cadletra == 160 || cadletra == 130 || cadletra == 162 || cadletra == 181 || cadletra == 224 || cadletra == 195) {
                num_req++;
            }
            cont++;

        }
        System.out.println(num_req);
    }

}
