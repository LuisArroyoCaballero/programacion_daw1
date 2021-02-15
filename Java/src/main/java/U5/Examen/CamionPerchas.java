package U5.Examen;

import java.util.Arrays;

public class CamionPerchas extends Vehiculo implements Comparable{
    private PrendaColgada[] prendaColgadas = new PrendaColgada[0];
    private int indice_prendasColgadas = 0;

    public CamionPerchas(String matricula, int carga_max, Conductor conductor, int num_tiendas){
        super (matricula,carga_max,conductor,num_tiendas);
    }

    /*GET INDICE PRENDAS COLGADAS*/

    public int getIndice_prendasColgadas() {
        return indice_prendasColgadas;
    }

    /*GET PRENDAS COLGADAS*/

    public PrendaColgada[] getPrendaColgadas() {
        return prendaColgadas;
    }

    /*METODO DESCARGAR*/

    public void descargar(){
        System.out.println("Descargando "+getIndice_prendasColgadas()+ " prendas.");
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "prendaColgadas=" + Arrays.toString(prendaColgadas) +
                ", indice_prendasColgadas=" + indice_prendasColgadas +
                '}';
    }

    /*ADD PRENDAS COLGADAS*/

    public void addPrendaColgada(PrendaColgada p){
        prendaColgadas = Arrays.copyOf(prendaColgadas,indice_prendasColgadas+1);
        prendaColgadas[indice_prendasColgadas++] = p;
    }

    /*DEL PRENDAS COLGADAS*/

    public void delPrendaColgada(PrendaColgada p) {
        if (p != null){
            for (int i = 0; i < this.prendaColgadas.length; i++) {
                if (this.prendaColgadas[i] != null && this.prendaColgadas[i].equals(p)) {
                    for (int j = i; j < this.prendaColgadas.length - 1; j++) {
                        if (this.prendaColgadas[j + 1] != null) {
                            this.prendaColgadas[j] = this.prendaColgadas[j + 1];
                            this.prendaColgadas[j + 1] = null;
                        }
                    }
                }
            }
            prendaColgadas = Arrays.copyOf(prendaColgadas,--indice_prendasColgadas);
        }
    }

    /*COMPARABLE (compareTo)*/

    public int compareTo(Object o) {
        if (o instanceof CamionPerchas){
            CamionPerchas camionPerchas = (CamionPerchas) o;
            return this.getIndice_prendasColgadas() - camionPerchas.getIndice_prendasColgadas();
        }
        else {
            return -1;
        }

    }


}
