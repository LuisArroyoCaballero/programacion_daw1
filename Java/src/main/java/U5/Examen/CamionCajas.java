package U5.Examen;

import java.util.Arrays;

public class CamionCajas extends Vehiculo implements Comparable{
    private Caja[] cajas = new Caja[0];
    private int indice_caja = 0;

    public CamionCajas(String matricula, int carga_max, Conductor conductor, int num_tiendas){
        super (matricula,carga_max,conductor,num_tiendas);
    }

    /*GET LISTA CAJAS*/

    public Caja[] getCajas() {
        return cajas;
    }

    /*GET INDICE CAJAS*/

    public int getIndice_caja() {
        return indice_caja;
    }

    /*METODO DESCARGAR*/

    public void descargar(){
        System.out.println("Descargando "+getIndice_caja()+" y "+Arrays.toString(cajas));
    }

    /*ADD CAJAS*/

    public void addCaja(Caja c){
        cajas = Arrays.copyOf(cajas,indice_caja+1);
        cajas[indice_caja++] = c;
    }

    /*DEL CAJAS*/

    public void delCaja(Caja c) {
        if (c != null){
            for (int i = 0; i < this.cajas.length; i++) {
                if (this.cajas[i] != null && this.cajas[i].equals(c)) {
                    for (int j = i; j < this.cajas.length - 1; j++) {
                        if (this.cajas[j + 1] != null) {
                            this.cajas[j] = this.cajas[j + 1];
                            this.cajas[j + 1] = null;
                        }
                    }
                }
            }
            cajas = Arrays.copyOf(cajas,--indice_caja);
        }
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajas=" + Arrays.toString(cajas) +
                ", indice_caja=" + indice_caja +
                '}';
    }

    /*COMPARABLE (compareTo)*/

    public int compareTo(Object o) {
        if (o instanceof CamionCajas){
            CamionCajas camionCajas = (CamionCajas) o;
            return this.getIndice_caja() - camionCajas.getIndice_caja();
        }
        else {
            return -1;
        }

    }
}
