package U5.Minecraft_Examen_1920;

public class Roca extends Material{
    private int dureza;

    public Roca(int masa, int burn_cap, int dil_cap, boolean mov, int dureza){
        super(masa,burn_cap,dil_cap,mov);
        setDureza(dureza);

    }

    /*NOMBRE ROCA*/

    public String getNombre(){
        return "Roca";
    }

    /*DUREZA*/

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Roca{" +
                super.toString() +
                " dureza=" + dureza +
                '}';
    }
}
