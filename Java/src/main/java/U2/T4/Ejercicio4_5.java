package U2.T4;
//Actividad 4.5 - Escribe un programa que muestre la hora actual

import java.time.LocalDateTime;

public class Ejercicio4_5 {
    public static void main(String arg[]) {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        System.out.println("Hora actual : " + hours + ":" + minutes + ":" + seconds);

    }
}