package U4.T1.Ejercicio_9.Personal;

public class Jefes {
    private String nombre_jefe;
    private String dni;

    public Jefes(String nombre_jefe, String dni) {
        setNombre_jefe(nombre_jefe);
        setDni(dni);
    }

    /*NOMBRE*/

    public String getNombre_jefe() {
        return nombre_jefe;
    }

    public void setNombre_jefe(String nombre_jefe) {
        this.nombre_jefe = nombre_jefe;
    }

    /*DNI*/

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Jefes{" +
                "nombre_jefe='" + nombre_jefe + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
