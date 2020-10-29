package U2.T8;
//Actividad 8.6: Escribir todos los múltiplos de 7 menores que 100.

public class Ejercicio8_06 {
    public static void main(String arg[]) {
        int cont = 8;
        int n = 100;

        while (cont!=n) {
            if (cont % 7 == 0) {
                System.out.println(cont);
            }
            cont++;
        }
    }
}
