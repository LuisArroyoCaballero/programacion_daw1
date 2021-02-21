package U6.T1.Ej_6;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que desea hacer?");
        System.out.println("Introduzca 1 para mostrar firmas.");
        System.out.println("Introduzca 2 para añadir la firma.");
        int opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 1){
            mostrarFirmas();
        }
        else if (opcion == 2){
            System.out.println("Introduzca su firma: ");
            String firma = sc.nextLine();
            insertarNombre(firma);
        }

    }

    public static void mostrarFirmas(){
        String texto = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_6//firmas.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea + '\n';
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);
    }

    public static void insertarNombre(String nombre){
        String texto = "";
        boolean b = false;
        try{
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_6//firmas.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto = linea;
                if (texto.equals(nombre)){
                    System.out.println("Lo siento, esta firma ya se encuentra en el archivo.");
                    b = true;
                    break;
                }

                linea = in.readLine();
            }
            in.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (b == false){
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter("Ficheros//U6//T1//Ej_6//firmas.txt", true));
                out.newLine();
                out.write(nombre);
                out.close();
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }


}
