package U6.T2.Ej_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero: ");
        double num_doub = sc.nextDouble();
        ObjectOutputStream out = null;

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros//U6//T2//Ej_1//prueba.dat");
            out = new ObjectOutputStream(archivo);
            out.writeDouble(num_doub);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (out!=null){
                    out.close();
                }
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
