package U2.T4;
//Actividad 4.3 - Modificar el ejercicio anterior para que muestre la parte entera de la media de tres
//notas decimales.
public class Ejercicio4_3 {
    public static void main(String arg[]) {
        float nota_1 = 8;
        float nota_2 = 9;
        float nota_3 = 5;
        int resultado = Math.round((nota_1+nota_2+nota_3)/3);
        System.out.println(resultado);
    }
}
