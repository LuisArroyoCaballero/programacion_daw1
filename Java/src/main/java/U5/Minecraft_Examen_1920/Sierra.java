package U5.Minecraft_Examen_1920;

public class Sierra extends Herramienta{
    private int diametro;

    public Sierra(int diametro){
        super(30,70,1,true);
        setDiametro(diametro);
    }

    /*NOMBRE*/

    public String getNombre(){
        return "Sierra";
    }

    /*DIAMETRO*/

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
}

