package U5.Entregable;

public class Judo extends Deporte{
    private int num_tatamis;

    public Judo(String nombre_deporte, String nombre_pabellon, int num_tatamis){
        super(nombre_deporte,nombre_pabellon);
        setNum_tatamis(num_tatamis);
    }

    /*NUMERO PRUEBAS*/

    public int getNum_tatamis() {
        return num_tatamis;
    }

    public void setNum_tatamis(int num_tatamis) {
        this.num_tatamis = num_tatamis;
    }
}
