package U5.Entregable;

import java.util.Objects;

public class Pais implements Comparable{
    private String nombre_paises;
    private int num_participantes;

    public Pais(String nombre_paises, int num_participantes){
        setNombre_paises(nombre_paises);
        setNum_participantes(num_participantes);

    }

    /*NOMBRE PAISES*/

    public String getNombre_paises() {
        return nombre_paises;
    }

    public void setNombre_paises(String nombre_paises) {
        this.nombre_paises = nombre_paises;
    }

    /*NUMERO PARTICIPANTES*/

    public int getNum_participantes() {
        return num_participantes;
    }

    public void setNum_participantes(int num_participantes) {
        this.num_participantes = num_participantes;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Pais{" +
                "nombre_paises='" + nombre_paises + '\'' +
                ", num_participantes=" + num_participantes +
                '}';
    }

    /*EQUALS PAISES*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais pais = (Pais) o;
        return num_participantes == pais.num_participantes &&
                Objects.equals(nombre_paises, pais.nombre_paises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_paises, num_participantes);
    }

    /*COMPARE TO*/

    public int compareTo(Object o) {
        if (o instanceof Pais){
            Pais pais = (Pais) o;
            return this.getNombre_paises().compareTo(pais.getNombre_paises());
        }
        else {
            return -1;
        }

    }
}
