package U4.T1.Ejercicio_9.Personal;

public class Maquinistas {
    private String nombre_maquinista;
    private String dni;
    private double sueldo_mes;
    private int rango;

    public Maquinistas(String nombre_maquinista, String dni, double sueldo_mes, int rango) {
        setNombre_maquinista(nombre_maquinista);
        setDni(dni);
        setSueldo_mes(sueldo_mes);
        setRango(rango);
    }

    /*NOMBRE*/

    public String getNombre_maquinista() {
        return nombre_maquinista;
    }

    public void setNombre_maquinista(String nombre_maquinista) {
        this.nombre_maquinista = nombre_maquinista;
    }

    /*DNI*/

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    /*SUELDO*/

    public double getSueldo_mes() {
        return sueldo_mes;
    }

    public void setSueldo_mes(double sueldo_mes) {
        this.sueldo_mes = sueldo_mes;
    }

    /*RANGO*/

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Maquinistas{" +
                "nombre_maquinista='" + nombre_maquinista + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo_mes=" + sueldo_mes +
                ", rango=" + rango +
                '}';
    }
}
