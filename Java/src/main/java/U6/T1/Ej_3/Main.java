package U6.T1.Ej_3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        duplicar();
        copiar("original.txt");


    }
    public static void duplicar() {
        String copiar = "";


        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_3//original.txt"));
            String linea = in.readLine();
            while (linea != null) {
                copiar = linea;
                linea = in.readLine();
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_3//copia.txt",true));
                    out.write(copiar);
                    out.newLine();
                    out.close();

                } catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
            in.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
    public static void copiar(String arch) {
        String copiar = "";


        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_3//"+arch));
            String linea = in.readLine();
            while (linea != null) {
                copiar = linea;
                linea = in.readLine();
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_3//copia_de_"+arch, true));
                    out.write(copiar);
                    out.newLine();
                    out.close();

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            in.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
