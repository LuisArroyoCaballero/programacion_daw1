package U6.T1.Ej_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int cont_lineas = 1;
        int cont_palabras = 0;
        int cont_carat = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("Ficheros//U6//T1//Ej_4//carta.txt"));
            int c = in.read();
            while (c != -1) {
                c = in.read();
                if ((char) c != '\n'){
                    if ((char) c != ' '){
                        cont_carat++;
                    }
                    else if ((char) c == ' '){
                        cont_carat++;
                        cont_palabras++;
                    }
                }
                else {
                    cont_lineas++;
                    cont_palabras++;
                }

            }
            cont_palabras++;
            in.close();

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Caracteres: "+cont_carat);
        System.out.println("Lineas: "+cont_lineas);
        System.out.println("Palabras: "+cont_palabras);
    }
}
