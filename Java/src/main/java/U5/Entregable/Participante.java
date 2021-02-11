package U5.Entregable;

import java.util.Objects;

public abstract class Participante {
    protected String nombre_atleta;
    protected int edad_atleta;

    public Participante(String nombre_atleta,int edad_atleta){
        setNombre_atleta(nombre_atleta);
        setEdad_atleta(edad_atleta);

    }

    /*METODO ABSTRACTO*/

    public abstract void hacerjuramento();

    /*NOMBRE ATLETA*/

    public String getNombre_atleta() {
        return nombre_atleta;
    }

    public void setNombre_atleta(String nombre_atleta) {
        this.nombre_atleta = nombre_atleta;
    }

    /*EDAD ATLETA*/

    public int getEdad_atleta() {
        return edad_atleta;
    }

    public void setEdad_atleta(int edad_atleta) {
        this.edad_atleta = edad_atleta;
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participante)) return false;
        Participante that = (Participante) o;
        return edad_atleta == that.edad_atleta &&
                Objects.equals(nombre_atleta, that.nombre_atleta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_atleta, edad_atleta);
    }

}
