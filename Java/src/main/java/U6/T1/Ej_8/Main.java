package U6.T1.Ej_8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String texto_1 = "";
        String texto_2 = "";

        try {
            BufferedReader in_1 = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_8//perso1.txt"));
            BufferedReader in_2 = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_8//perso2.txt"));
            String linea_1 = "";
            String linea_2 = "";
            int compara = 0;
            while (linea_1 != null && linea_2 != null) {
                texto_1 = linea_1;
                linea_1 = in_1.readLine();
                texto_2 = linea_2;
                linea_2 = in_2.readLine();
                if (linea_1 != null && linea_2 != null){
                    compara = linea_1.compareToIgnoreCase(linea_2);
                }
                if (linea_1 != null && compara > 1) {
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_8//otros.txt", true));
                        out.write(linea_1);
                        out.newLine();
                        out.close();

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                else if (linea_2 != null && compara < 1) {
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_8//otros.txt", true));
                        out.write(linea_2);
                        out.newLine();
                        out.close();

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                else if (linea_2 != null && linea_1 != null && compara == 0){
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_8//otros.txt", true));
                        out.write(linea_1);
                        out.newLine();
                        out.close();

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                if (linea_1 == null && linea_2 != null) {
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_8//otros.txt", true));
                        out.write(linea_2);
                        out.newLine();
                        out.close();

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                if (linea_2 == null && linea_1 != null) {
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_8//otros.txt", true));
                        out.write(linea_1);
                        out.newLine();
                        out.close();

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                }
            }
            in_1.close();
            in_2.close();

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


