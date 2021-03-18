package U7.T1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int contador = 0;
        int entero = 0;
        ArrayList<Integer> intlist = new ArrayList<>();
        while (contador != 20) {
            entero = (int) (Math.random()*100)+1;
            intlist.add(entero);
            contador++;
        }
        Collections.sort(intlist);
        System.out.println(intlist);
    }
}
