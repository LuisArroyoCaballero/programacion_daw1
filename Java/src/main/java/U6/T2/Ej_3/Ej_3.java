package U6.T2.Ej_3;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numeros positivos, para salir introduzca un positivo.");
        int num = sc.nextInt();
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros//U6//T2//Ej_3//enteros.dat");
            out = new ObjectOutputStream(archivo);

            while (num > 0) {
                out.writeInt(num);
                num = sc.nextInt();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }

        try {
            FileInputStream archivo = new FileInputStream("Ficheros//U6//T2//Ej_3//enteros.dat");
            in = new ObjectInputStream(archivo);

            while (true){
                System.out.println(in.readInt());
            }
        }
        catch (EOFException exception_final) {
            System.out.println("");
        }
        catch (IOException exception) {
            System.out.println("");
        }

        finally {
            try {
                if (in != null){
                    in.close();
                }
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
