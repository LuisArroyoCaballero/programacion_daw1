package U4.T1.Ejercicio_8;

public class Bombilla {
    private boolean estado_bombilla;
    private static boolean estado_fusible;

    public Bombilla() {
        setEstado_bombilla(false);
        setEstado_fusible(true);
    }


    /*BOMBILLA*/

    private void setEstado_bombilla(boolean estado_bombilla) {
        this.estado_bombilla= estado_bombilla;
    }

    public boolean getEstado_bombilla() {
        return estado_bombilla;
    }

    void encender_bombilla(){
        setEstado_bombilla(true);
    }
    void apagar_bombilla(){
        setEstado_bombilla(false);
    }

    /*FUSIBLE*/

    public static void setEstado_fusible(boolean estado_fusible) {
        Bombilla.estado_fusible = estado_fusible;
    }

    public static boolean getEstado_fusible() {
        return estado_fusible;
    }

    static void encender_fusibles(){
        setEstado_fusible(true);
    }
    static void apagar_fusibles(){
        setEstado_fusible(false);
    }

    /*MOSTRAR ESTADO*/

    void Mostrar_Estado(){
        if (this.estado_bombilla && Bombilla.estado_fusible){
            System.out.println("La bombilla esta ENCENDIDA");
        }
        else{
            System.out.println("La bombilla esta APAGADA");
        }
    }

}
