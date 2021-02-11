package U4.T1.Ejercicio_9.Personal;

public class Mecanicos {
    private String nombre_mecanicos;
    private int telefono;
    private String especialidad;

    public Mecanicos(String nombre_mecanicos, int telefono, String especialidad) {
        setNombre_mecanicos(nombre_mecanicos);
        setTelefono(telefono);
        setEspecialidad(especialidad);
    }

    /*NOMBRE*/

    public String getNombre_mecanicos() {
        return nombre_mecanicos;
    }

    public void setNombre_mecanicos(String nombre_mecanicos) {
        this.nombre_mecanicos = nombre_mecanicos;
    }

    /*TELEFONO*/

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /*ESPECIALIDAD*/

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Mecanicos{" +
                "nombre_mecanicos='" + nombre_mecanicos + '\'' +
                ", telefono=" + telefono +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
