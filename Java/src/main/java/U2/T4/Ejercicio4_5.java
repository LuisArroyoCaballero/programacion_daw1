package U2.T4;
//Actividad 4.5 - Escribe un programa que muestre la hora actual

import java.util.SimpleTimeZone;

public class Ejercicio4_5 {
    public static void main(String arg[]) {
        SimpleTimeZone reloj = new SimpleTimeZone();
        int hora = reloj.nextInt(
        System.out.println(hora);

    }
}

