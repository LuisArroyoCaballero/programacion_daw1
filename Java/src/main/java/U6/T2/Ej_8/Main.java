package U6.T2.Ej_8;

//Actividad 8. Crear una tabla de números aleatorios menores que 100, ordenados de menor a mayor,
// y guardarlos en un fichero binario. A continuación, recuperarlos y mostrarlos por consola.

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;

        int[] t1 = new int[7];

        for (int i = 0; i < t1.length; i++) {
            t1[i] = (int) ((Math.random()*100)+1);

        }
        Arrays.sort(t1);

        try {
            FileOutputStream archivo = new FileOutputStream("Ficheros//U6//T2//Ej_8//ordenados.dat");
            out = new ObjectOutputStream(archivo);

            out.writeObject(t1);

        }
        catch (IOException ex) {
            ex.getMessage();
        }
        finally {
            try {
                if (out!=null){
                    out.close();                }
            }
            catch (IOException ex) {
                ex.getMessage();
            }
        }

        try {
            FileInputStream archivo = new FileInputStream("Ficheros//U6//T2//Ej_8//ordenados.dat");
            in = new ObjectInputStream(archivo);

            int[] tabla = (int[]) in.readObject();

            System.out.println(Arrays.toString(tabla));

        }
        catch (IOException | ClassNotFoundException ex) {
            ex.getMessage();
        }
        finally {
            try {
                if (in!=null){
                    in.close();                }
            }
            catch (IOException ex) {
                ex.getMessage();
            }
        }
    }
}
