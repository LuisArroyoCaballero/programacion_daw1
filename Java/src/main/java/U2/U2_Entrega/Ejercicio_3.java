package U2.U2_Entrega;
//Escribe un programa que sea capaz de insertar un dígito dentro de un número
//indicando la posición. El nuevo dígito se colocará en la posición indicada y el
//resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
//izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
//correctamente los datos. Se recomienda usar long en lugar de int ya que el
//primero admite números más largos.
//
//Ejemplo:
//Por favor, introduzca un número entero positivo: 406783
//Introduzca la posición donde quiere insertar: 3
//Introduzca el dígito que quiere insertar: 5
//El número resultante es 4056783.

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_3 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long num_orig = teclado.nextLong();
        System.out.println("Introduzca la posición donde quiere insertar: ");
        long pos = teclado.nextInt();
        System.out.println("Introduzca el dígito que quiere insertar: ");
        long insert = teclado.nextInt();
        long num_tam = num_orig;
        int cont_tam = 0;
        double almacen= 0;
        double num_orig_double = (double)num_orig;
        double resultado1 = 0;
        double resultado2 = 0;
        while (num_tam!=0){
            num_tam = num_tam/10;
            cont_tam++;
        }
        num_orig_double= num_orig_double/(Math.pow(10,(cont_tam-pos+1)));
        almacen = (num_orig%(Math.pow(10,(cont_tam-pos+1))));
        almacen = almacen/(Math.pow(10,(cont_tam-pos+1)));




        resultado1=(((((long)num_orig_double)*(10))+insert)+(almacen));
        resultado2=resultado1*(Math.pow(10,(cont_tam-pos+1)));

        long resultado_final = (long)resultado2;

        System.out.println(resultado_final);

    }
}
