package U4.T1.Ejercicio_9.Maquinaria;

import U4.T1.Ejercicio_9.Maquinaria.Locomotoras;
import U4.T1.Ejercicio_9.Maquinaria.Trenes;
import U4.T1.Ejercicio_9.Personal.Maquinistas;
import U4.T1.Ejercicio_9.Personal.Mecanicos;

public class Main {
    public static void main(String arg[]){
        Vagones v1 = new Vagones(50,6,"Colchonetas");
        Vagones v2 = new Vagones(66,7,"Maricones");
        Vagones v3 = new Vagones(76,8,"Knekro");
        Vagones v4 = new Vagones(86,9,"Andorra");


        Mecanicos mec1 = new Mecanicos("Julietta", 12345, "Llorar");
        Maquinistas m1 = new Maquinistas("Armando","231231231R",500,3);
        Locomotoras l1 = new Locomotoras("9876 BEW", 56,60,mec1);
        Trenes t1 = new Trenes(l1,m1);

        t1.Add_vagon(v1);
        t1.Add_vagon(v3);
        t1.Add_vagon(v2);
        t1.Quitar_vagon(v3);

        System.out.println(t1.toString());

    }
}
