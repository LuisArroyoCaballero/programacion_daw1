package U5.Examen;

import java.util.Comparator;

public class ComparaCarga_max implements Comparator {
    public int compare(Object c1, Object c2) {
        CamionCajas Cam1 = (CamionCajas) c1;
        CamionCajas Cam2 = (CamionCajas) c2;


        return Cam1.getCarga_max() - Cam2.getCarga_max();
    }
}

