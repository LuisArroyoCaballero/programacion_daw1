package U5.Entregable;

public class Baloncesto extends Deporte{
    private int num_equipos;

    public Baloncesto(String nombre_deporte, String nombre_pabellon, int num_equipos){
        super(nombre_deporte,nombre_pabellon);
        setNum_equipos(num_equipos);
    }

    /*NUMERO EQUIPOS*/

    public int getNum_equipos() {
        return num_equipos;
    }

    public void setNum_equipos(int num_equipos) {
        this.num_equipos = num_equipos;
    }

    /*TO STRING*/


}
