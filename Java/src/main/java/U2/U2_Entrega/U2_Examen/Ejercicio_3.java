package U2.U2_Entrega.U2_Examen;
//Ejercicio 3
//Escribe un programa que, dado un número entero, diga cuáles son y cuánto
//suman los dígitos pares por un lado, y los impares por otro. Los dígitos
//se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int
//donde sea necesario para admitir números largos.
//
//Ejemplo 1:
//Por favor, introduzca un número entero positivo: 94026782
//Dígitos pares: 4 0 2 6 8 2
//Dígitos impares: 9 7
//Suma de los dígitos pares: 22
//Suma de los dígitos impares: 16
//
//Ejemplo 2:
//Por favor, introduzca un número entero positivo: 31779
//Dígitos pares:
//Dígitos impares: 3 1 7 7 9
//Suma de los dígitos pares: 0
//Suma de los dígitos impares: 27
//
//Ejemplo 3:
//Por favor, introduzca un número entero positivo: 2404
//Dígitos pares: 2 4 0 4
//Dígitos impares:
//Suma de los dígitos pares: 10
//Suma de los dígitos impares: 0
//
//NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_3 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero entero positivo: ");
        long num = teclado.nextLong();
        long num_longitud = num;
        char num_char = (char) num;
        int cont = 0;
        int digitos = 0;
        double pares = 0;
        int cont_pares = 0;
        double impares = 0;
        int cont_impares = 0;
        int escritura_pares = 0;
        int escritura_impares = 0;
        double almacen_pares = 0;
        double almacen_impares = 0;


        while (num_longitud != 0) {
            num_longitud= num_longitud/10;
            digitos++;
        }

        while (cont!=digitos){
            if (num % 2 == 0){
                pares = (pares)+((num%10)*(Math.pow(10,cont_pares)));
                cont_pares++;
            }
            if (num % 2 != 0){
                impares = (impares)+((num%10)*(Math.pow(10,cont_impares)));
                cont_impares++;
            }


            num=num/10;
            cont++;
        }
        //System.out.println(pares);
        //System.out.println(impares);
        int impares_1 = (int) impares;
        int pares_1 = (int) pares;

        while (pares_1!=0) {
            almacen_pares = (almacen_pares)+((pares_1%10)*(Math.pow(10,cont_pares)));
            System.out.println(almacen_pares);
            pares_1 = pares_1/10;
            cont_pares--;
            almacen_pares=almacen_pares*10;
        }
        while (impares_1!=0) {
            almacen_impares = (almacen_impares)+((impares_1%10)*(Math.pow(10,cont_impares)));
            System.out.println(almacen_impares);
            impares_1 = impares_1/10;
            cont_impares--;
        }




    }
}
