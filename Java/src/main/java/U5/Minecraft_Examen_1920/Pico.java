package U5.Minecraft_Examen_1920;

public class Pico extends Herramienta{
    private int grosor;

    public Pico(int grosor){
        super(20,30,2,true);
        setGrosor(grosor);
    }

    /*NOMBRE*/

    public String getNombre(){
        return "Pico";
    }

    /*GROSOR*/

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
}
