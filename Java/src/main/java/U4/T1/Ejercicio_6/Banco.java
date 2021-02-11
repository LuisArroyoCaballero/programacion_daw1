package U4.T1.Ejercicio_6;

public class Banco {
    private String nombre;
    public double capital;
    public String direccion_central;

    public Banco (String nombre, String direccion_central, double capital) {
        this.nombre = nombre;
        setCapital(capital);
        setDireccion(direccion_central);
    }
    public Banco (String nombre, String direccion_central) {
        this.nombre = nombre;
        setCapital(5200000);
        setDireccion(direccion_central);
    }

    /*NOMBRE*/

    String getNombre(){
        return nombre;
    }

    /*CAPITAL*/

    void setCapital(double capital){
        this.capital=capital;
    }

    double getCapital(){
        return capital;
    }

    /*DIRECCION*/

    void setDireccion(String direccion_central
    ){
        this.direccion_central=direccion_central;
    }

    String getDireccion(){
        return direccion_central;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", capital=" + capital +
                ", direccion_central='" + direccion_central + '\'' +
                '}';
    }
}
