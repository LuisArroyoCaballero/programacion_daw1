package U7.Arroyo_Caballero_U6U7_Examen;

import java.io.Serializable;

public class Dorsal implements Serializable {
    private int dorsal;
    private static int contador_dorsal = 0;

    /*CONSTRUCTOR*/

    public Dorsal() {
        setDorsal();
    }

    /*SET AND GET*/

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal() {
        this.dorsal = contador_dorsal++;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Dorsal{" +
                "dorsal=" + dorsal +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
