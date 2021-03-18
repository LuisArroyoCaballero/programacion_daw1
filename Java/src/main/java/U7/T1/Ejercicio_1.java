package U7.T1;

//Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100, y guardarlos en el orden
//en que se vayan generando; mostrar por pantalla dicha lista una vez creada. Ordenarla en sentido creciente
//y volverla a mostrar por pantalla.


import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int contador = 0;
        int entero = 0;
        ArrayList<Integer> intlist = new ArrayList<>();
        while (contador != 20) {
            entero = (int) (Math.random()*100)+1;
            intlist.add(entero);
            contador++;
        }
        System.out.println(intlist);
    }
}
