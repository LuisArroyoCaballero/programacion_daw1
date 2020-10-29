package U2.T8;
//Actividad 8.9: Un centro de investigación de la flora urbana necesita
//una aplicación que muestre cual es el árbol más alto. Para ello se introducirán por teclado las alturas en cms
//de cada árbol, terminando cuando se introduzca -1.
//Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.

import java.util.Scanner;

public class Ejercicio8_09 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        int higher_tree = 0;
        int higher_num = 0;
        System.out.println("Introduzca la altura de los árboles en cm, para salir introduzca -1:");
        int arbol = teclado.nextInt();

        while (arbol!=-1) {
            if (higher_tree < arbol) {
                higher_tree = arbol;
                higher_num = cont;
            }
            System.out.println("Introduzca el siguiente árbol.");
            arbol = teclado.nextInt();
            cont++;
        }
        System.out.println("El árbol "+higher_num+" es el árbol mas alto, con una altura de "+higher_tree+" cm.");

    }
}
