package U5.Examen;

public class Conductor {
    private String nombre;
    private String apellidos;
    private int NSS;

    public Conductor(String nombre, String apellidos, int NSS){
        setNombre(nombre);
        setApellidos(apellidos);
        setNSS(NSS);
    }

    /*NOMBRE*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*APELLIDOS*/

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /*NSS*/

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", NSS=" + NSS +
                '}';
    }
}
