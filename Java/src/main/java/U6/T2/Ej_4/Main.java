package U6.T2.Ej_4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero por teclado: ");
        int entero = sc.nextInt();
        int contador = 0;
        double[] tabla_double = new double[entero];
        ObjectOutputStream out = null;

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros//U6//T2//Ej_4//tablaDouble.dat");
            out = new ObjectOutputStream(archivo);

            for (int i = 0; i <= tabla_double.length-1; i++) {
                double valor_double = sc.nextDouble();
                tabla_double[i] = valor_double;
            }

            out.writeObject(tabla_double);

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                if (out!=null){
                    out.close();
                }
            }
            catch (IOException ex){
                ex.getMessage();
            }
        }



    }
}
