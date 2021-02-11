package U5.Entregable;

public class Atletismo extends Deporte{
    private int num_pruebas;

    public Atletismo(String nombre_deporte, String nombre_pabellon, int num_pruebas){
        super(nombre_deporte,nombre_pabellon);
        setNum_pruebas(num_pruebas);
    }

    /*NUMERO PRUEBAS*/

    public int getNum_pruebas() {
        return num_pruebas;
    }

    public void setNum_pruebas(int num_pruebas) {
        this.num_pruebas = num_pruebas;
    }
}
