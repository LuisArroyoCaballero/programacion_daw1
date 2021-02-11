package U4.T1.Ejercicio_8;

public class main {
    public static void main(String arg[]){
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();
        Bombilla b4 = new Bombilla();

        b1.encender_bombilla();
        b3.encender_bombilla();


        b1.Mostrar_Estado();
        b2.Mostrar_Estado();
        b3.Mostrar_Estado();
        b4.Mostrar_Estado();
        System.out.println("");

        Bombilla.apagar_fusibles();

        b1.Mostrar_Estado();
        b2.Mostrar_Estado();
        b3.Mostrar_Estado();
        b4.Mostrar_Estado();
        System.out.println();

        Bombilla.encender_fusibles();

        b1.Mostrar_Estado();
        b2.Mostrar_Estado();
        b3.Mostrar_Estado();
        b4.Mostrar_Estado();

    }
}
