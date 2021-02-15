package U5.Examen;

import java.util.Objects;

public class PrendaColgada  extends Prenda implements Colgar{
    private double altura_colgar;

    public PrendaColgada(double precio, String nombre, int cod_barras, double peso, double altura_colgar) {
        super(precio, nombre, cod_barras, peso);
        setAltura_colgar(altura_colgar);
    }

    /*ALTURA A LA QUE DEBEMOS COLGAR*/

    public double getAltura_colgar() {
        return altura_colgar;
    }

    public void setAltura_colgar(double altura_colgar) {
        this.altura_colgar = altura_colgar;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "altura_colgar=" + altura_colgar +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrendaColgada)) return false;
        if (!super.equals(o)) return false;
        PrendaColgada that = (PrendaColgada) o;
        return Double.compare(that.altura_colgar, altura_colgar) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), altura_colgar);
    }

    /*DOBLAR*/

    @Override
    public void doblar(){
        System.out.println("La prenda "+getNombre()+" no se puede doblar");
    }

    /*COLGAR*/

    @Override
    public void colgar() {
        System.out.println( "La prenda "+getNombre()+" se debe colgar");
    }
}
