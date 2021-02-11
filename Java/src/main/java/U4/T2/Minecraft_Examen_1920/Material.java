package U4.T2.Minecraft_Examen_1920;

public abstract class Material implements Comparable {
    private int masa;
    private int burn_cap;
    private int dil_cap;
    private boolean mov;

    /*CONSTRUCTOR*/

    public Material(int masa, int burn_cap, int dil_cap, boolean mov) {
        setMasa(masa);
        setBurn_cap(burn_cap);
        setDil_cap(dil_cap);
        setMov(mov);
    }

    /*NOMBRE*/

    public abstract String getNombre();

    /*MASA*/

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        if (masa <= 1000 && masa > 0){
            this.masa = masa;
        }
    }

    /*QUEMARSE*/

    public int getBurn_cap() {
        return burn_cap;
    }

    public void setBurn_cap(int burn_cap) {
        if (burn_cap > 0 && burn_cap <=100) {
            this.burn_cap = burn_cap;
        }
    }

    /*DILUIRSE*/

    public int getDil_cap() {
        return dil_cap;
    }

    public void setDil_cap(int dil_cap) {
        if (dil_cap > 0 && dil_cap <= 100){
            this.dil_cap = dil_cap;
        }
    }

    /*MOVIBLE*/

    public boolean isMov() {
        return mov;
    }

    public void setMov(boolean mov) {
        this.mov = mov;
    }

    /*COMPARE TO*/

    public int compareTo(Object o) {
        if (o instanceof Material){
            Material mat = (Material) o;
            return this.getMasa() - mat.masa;
        }
        else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "Material{" +
                "Nombre="+ this.getNombre() +
                ", masa=" + masa +
                ", burn_cap=" + burn_cap +
                ", dil_cap=" + dil_cap +
                ", mov=" + mov +
                '}';
    }
}
