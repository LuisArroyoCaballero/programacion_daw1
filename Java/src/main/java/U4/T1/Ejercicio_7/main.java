package U4.T1.Ejercicio_7;

public class main {
    public static void main(String arg[]){
        Radio r1 = new Radio();

        System.out.println(r1.toString());

        r1.Down();
        System.out.println(r1.toString());

        r1.Down();
        r1.Down();
        r1.Down();
        System.out.println(r1.toString());

        r1.Up();
        r1.Up();
        System.out.println(r1.toString());
    }
}
