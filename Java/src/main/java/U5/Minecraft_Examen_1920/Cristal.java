package U5.Minecraft_Examen_1920;

public class Cristal extends Material {

    public enum TipoCristal {
        TRANSLUCIDO,
        TRANSPARENTE
    }

    private TipoCristal tipo;

    public Cristal(int masa, int burn_cap, int dil_cap, boolean mov, TipoCristal tipo){
        super(masa,burn_cap,dil_cap,mov);
        setTipoCristal(tipo);
    }

    /*NOMBRE CRISTAL*/

    public String getNombre(){
        return "Cristal";
    }

    /*TIPO CRISTAL*/

    public TipoCristal getTipo() {
        return tipo;
    }

    public void setTipoCristal(TipoCristal tipo) {
        this.tipo = tipo;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Cristal{" +
                super.toString() +
                " tipo=" + tipo +
                '}';
    }
}
