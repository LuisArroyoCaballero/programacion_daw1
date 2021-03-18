package U7.Entregable;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Unidad implements Serializable {
    private String curso;
    private List<Alumno> alumnos;

    /*CONSTRUCTOR*/

    public Unidad(String curso) {
        setCurso(curso);
    }

    /*SETTER AND GETTER*/

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Unidad{" +
                "curso='" + curso + '\'' +
                '}';
    }

    /*EGUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unidad)) return false;
        Unidad unidad = (Unidad) o;
        return Objects.equals(curso, unidad.curso) &&
                Objects.equals(alumnos, unidad.alumnos);
    }

}
