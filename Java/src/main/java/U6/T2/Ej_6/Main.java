package U6.T2.Ej_6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            FileInputStream archivo = new FileInputStream("Ficheros//U6//T2//Ej_4//tablaDouble.dat");
            in = new ObjectInputStream(archivo);

            double[] tabla = (double[]) in.readObject();

            for (int i = 0; i < tabla.length; i++) {
                System.out.println(tabla[i]);
            }

        }
        catch (IOException | ClassNotFoundException ex) {
            ex.getMessage();
        }
        finally {
            try {
                if (in != null){
                    in.close();
                }
            }
            catch (IOException ex) {
                ex.getMessage();
            }
        }
    }
}
