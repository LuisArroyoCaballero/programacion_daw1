package U4.T2.Minecraft_Examen_1920;


import java.util.Arrays;

public class Minecraft {
    private Material[] materiales = new Material[10];
    private int indice = 0;

    public Minecraft(){}

    /*MATERIALES*/

    public Material[] getMateriales() {
        Material[] material2 = new Material[indice];
        material2 = Arrays.copyOf(materiales,indice);

        return material2;

    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }

    /*INDICE*/

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    /*ADD MATERIAL*/

    public void Add_material(Material mat){
        if (indice < this.materiales.length){
            this.materiales[indice++] = mat;
        }
    }

    /*DEL MATERIAL*/

    public void borrarMaterialSinMasa(){
        for (int i=0; i < this.materiales.length; i++) {
            if (this.materiales[i] != null && this.materiales[i].getMasa() < 1){
                for ( int j = i; j < this.materiales.length-1; j++){
                    if (this.materiales[j+1] != null){
                        this.materiales[j] = this.materiales[j+1];
                        this.materiales[j+1] = null;
                    }
                }
            }
        }
    }


    /*MOSTRAR ESTADO*/


    public String mostrarEstado() {
        return "Minecraft{" +
                "materiales=" + Arrays.toString(materiales) +
                '}';
    }

    /*ULTIMO MATERIAL*/

    public void ultimoMaterialQueQueda() {
        for (int i=0; i < this.getIndice(); i++) {

        }
    }
}
