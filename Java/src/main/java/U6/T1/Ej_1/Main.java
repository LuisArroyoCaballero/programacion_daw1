package U6.T1.Ej_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del fichero a mostrar:");
        String cad = sc.nextLine();
        if (cad.isEmpty()) {
            cad = "Ficheros//U6//T1//Ej_1//prueba.txt";
        }

        String mostrar = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(cad));
            String linea = in.readLine();
            while (linea != null) {
                mostrar += linea;
                linea = in.readLine();
            }
            in.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(mostrar);
    }
}
