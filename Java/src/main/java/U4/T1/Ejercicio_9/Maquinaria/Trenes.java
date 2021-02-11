package U4.T1.Ejercicio_9.Maquinaria;

import U4.T1.Ejercicio_9.Personal.Maquinistas;

import java.util.Arrays;

public class Trenes {
    private Locomotoras locomotora;
    private final int Max_Vagones = 5;
    private Maquinistas maquinista;
    private Vagones[] vagones = new Vagones[Max_Vagones];
    private int indice = 0;

    public Trenes(Locomotoras locomotora, Maquinistas maquinista) {
        setLocomotora(locomotora);
        setMaquinista(maquinista);
    }

    /*LOCOMOTORA*/

    public Locomotoras getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotoras locomotora) {
        this.locomotora = locomotora;
    }

    /*MAQUINISTAS*/

    public Maquinistas getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinistas maquinista) {
        this.maquinista = maquinista;
    }

    /*AÑADIR VAGONES*/

    public void Add_vagon(Vagones vag){
        if (indice < this.vagones.length) {
            vagones[indice++] = vag;
        }
    }

    /*QUITAR VAGONES*/

    public void Quitar_vagon(Vagones vag){

        for (int i=0; i < this.vagones.length; i++) {
            if (vagones[i] != null && vagones[i].equals(vag)){
                for ( int j = i; j < this.vagones.length-1; j++){
                    if (vagones[j+1] != null){
                        vagones[j] = vagones[j+1];
                        vagones[j+1] = null;
                    }
                }
            }
        }

    }

    /*TO STRING*/

    @Override
    public String toString() {
        String s = "[";

        for (int i = 0; i < this.vagones.length; i++){
            if (this.vagones[i] != null){
                s += vagones[i].toString();
                if (this.vagones[i+1] != null){
                    s += ", ";
                }
            }
        }
        s+="]";
        return "Trenes{" +
                "locomotora=" + locomotora +
                ", Max_Vagones=" + Max_Vagones +
                ", maquinista=" + maquinista +
                ", vagones=" + s +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trenes trenes = (Trenes) o;
        return Arrays.equals(vagones, trenes.vagones);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(vagones);
    }




}
