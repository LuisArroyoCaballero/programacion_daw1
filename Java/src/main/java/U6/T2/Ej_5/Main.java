package U6.T2.Ej_5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            FileInputStream archivo = new FileInputStream("Ficheros//U6//T2//Ej_4//tablaDouble.dat");
            in = new ObjectInputStream(archivo);

            double[] tabla = (double[]) in.readObject();
            System.out.println(Arrays.toString(tabla));

        }
        catch (EOFException ex) {
            System.out.println("");
        }
        catch (IOException ex) {
            ex.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (in!=null){
                    in.close();
                }
            }
            catch (IOException ex){
                ex.getMessage();
            }
        }
    }
}
