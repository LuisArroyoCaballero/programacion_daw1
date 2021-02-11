package U4.T2.Minecraft_Examen_1920;

import java.util.Comparator;

public class ComparaDiluirse implements Comparator {
    public int compare(Object m1, Object m2){
        Material Mat1 = (Material) m1;
        Material Mat2 = (Material) m2;

        return Mat1.getDil_cap() - Mat2.getDil_cap();
    }
}
