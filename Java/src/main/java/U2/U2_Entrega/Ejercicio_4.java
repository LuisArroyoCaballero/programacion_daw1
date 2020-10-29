package U2.U2_Entrega;
//Escribe un programa que pida un número entero positivo por teclado y que
//muestre a continuación los 5 números consecutivos a partir del número
//introducido (incluyendo él mismo). Al lado de cada número se debe indicar
//si se trata de un primo o no.
//
//Ejemplo:
//Por favor, introduzca un número entero positivo: 17
//17 es primo
//18 no es primo
//19 es primo
//20 no es primo
//21 no es primo

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        int num = teclado.nextInt();
        int i;
        int j;

        for (i=1;i<=5;i++){
            boolean es_primo = false;
            for (j=2;j<=(num-1);j++) {
                if (num%j==0){
                    es_primo = true;
                    break;
                }
            }
            if (es_primo==true){
                System.out.println(num+" no es primo.");
            }
            else{
                System.out.println(num+" es primo.");
            }
            num++;
        }
    }
}
