package U6.T1.Ej_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre;
        int edad;
        String text;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_2//Ejercicios_2.txt"));
            out.write("Nombre: "+nombre);
            out.newLine();
            out.write("Edad: "+edad);
            out.close();

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }
}
