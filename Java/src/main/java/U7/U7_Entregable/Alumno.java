package U7.U7_Entregable;

import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Serializable {
    private String nombre;
    private String apellidos;
    private String dni;
    private int id;
    private Unidad unidad;
    private static int contador_id = 1;

    /*CONSTRUCTOR*/

    public Alumno(String nombre, String apellidos, String dni, Unidad unidad) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDni(dni);
        setUnidad(unidad);
        setId(contador_id++);
    }

    /*GETTER AND SETTER*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return id == alumno.id &&
                Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(apellidos, alumno.apellidos) &&
                Objects.equals(dni, alumno.dni) &&
                Objects.equals(unidad, alumno.unidad);
    }
}
