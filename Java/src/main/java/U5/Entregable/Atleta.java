package U5.Entregable;

public class Atleta extends Participante implements Correr{
    private String nombre_prueba;

    public Atleta(String nombre_atleta,int edad_atleta, String nombre_prueba){
        super(nombre_atleta,edad_atleta);
        setNombre_prueba(nombre_prueba);
    }

    /*NOMBRE PRUEBA*/

    public String getNombre_prueba() {
        return nombre_prueba;
    }

    public void setNombre_prueba(String nombre_prueba) {
        this.nombre_prueba = nombre_prueba;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+getNombre_atleta()+" como atleta, juro los valores deportivos mundiales.");
    }

    /*CORRER*/

    public void correr() {
        System.out.println("Voy a correr.");
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre_prueba='" + nombre_prueba + '\'' +
                ", nombre_atleta='" + nombre_atleta + '\'' +
                ", edad_atleta=" + edad_atleta +
                '}';
    }
}
