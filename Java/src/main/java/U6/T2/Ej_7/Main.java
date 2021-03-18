package U6.T2.Ej_7;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String txt = sc.nextLine();

        /*CREAR Y EDITAR EL ARCHIVO*/

        ObjectOutputStream out = null;
         try {
             FileOutputStream archivo = new FileOutputStream("Ficheros//U6//T2//Ej_7//fraseBinaria.dat");
             out = new ObjectOutputStream(archivo);

             out.writeObject(txt);
         }
         catch (IOException ex ) {
             System.out.println(ex.getMessage());
         }
         finally {
             try {
                 if (out!=null) {
                     out.close();
                 }
             }
             catch (IOException ex) {
                 System.out.println(ex.getMessage());
             }
         }

         /*LECTURA DEL FICHERO BINARIO*/
        ObjectInputStream in = null;

         try {
             FileInputStream archivo = new FileInputStream("Ficheros//U6//T2//Ej_7//fraseBinaria.dat");
             in = new ObjectInputStream(archivo);

             String texto = (String) in.readObject();
             System.out.println(texto);
         }
         catch (IOException | ClassNotFoundException ex) {
             System.out.println(ex.getMessage());
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
