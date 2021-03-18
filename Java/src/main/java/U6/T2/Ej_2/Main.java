package U6.T2.Ej_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            FileInputStream archivo = new FileInputStream("Ficheros//U6//T2//Ej_1//prueba.dat");
            in = new ObjectInputStream(archivo);
            double leer_doub = in.readDouble();
            System.out.println(leer_doub);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                if (in != null){
                    in.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
