package U6.T1.Ej_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;
        int actual = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_5//numeros.txt"));
            String linea = in.readLine();
            mayor = Integer.parseInt(linea);
            menor = Integer.parseInt(linea);
            while (linea != null) {
                actual = Integer.parseInt(linea);
                if (actual > mayor) {
                    mayor = actual;
                }
                if (actual < menor) {
                    menor = actual;
                }
                linea = in.readLine();
            }


        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(mayor);
        System.out.println(menor);
    }
}
