package U4.T2.Minecraft_Examen_1920;

public class Metal extends Material{
    private boolean imantable;

    public Metal(int masa, int burn_cap, int dil_cap, boolean mov, boolean imantable) {
        super(masa,burn_cap,dil_cap,mov);
        setImantable(imantable);

    }

    /*NOMBRE METAL*/

    public String getNombre(){
        return "Metal";
    }

    /*IMANTABLE*/

    public boolean isImantable() {
        return imantable;
    }

    public void setImantable(boolean imantable) {
        this.imantable = imantable;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Metal{" +
                super.toString() +
                " imantable=" + imantable +
                '}';
    }
}
