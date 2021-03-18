package U6.T1.Ej_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_7//Lectura_More.txt"));
            String texto = "";
            String linea = in.readLine();
            while (linea != null) {
                if (contador != 0 && contador % 24 == 0) {
                    sc.nextLine();
                }
                texto = linea;
                System.out.println(texto);
                contador++;
                linea = in.readLine();
            }
            in.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
