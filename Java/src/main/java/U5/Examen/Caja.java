package U5.Examen;

import java.util.Arrays;

public class Caja {
    private int numero_caja;
    private Prenda[] prendas = new Prenda[5];
    private int indice_prendas = 0;

    public Caja(int numero_caja) {
        setNumero_caja(numero_caja);
    }

    /*GET NUMERO CAJA*/

    public int getNumero_caja() {
        return numero_caja;
    }

    public void setNumero_caja(int numero_caja) {
        this.numero_caja = numero_caja;
    }

    /*GET INDICE PRENDA*/

    public int getIndice_prendas() {
        return indice_prendas;
    }

    /*ADD PRENDA*/

    public void addPrenda(Prenda p){
        prendas[indice_prendas++] = p;
    }

    /*DEL PRENDA*/

    public void delPrenda(Prenda p) {
        if (p != null){
            for (int i = 0; i < this.prendas.length; i++) {
                if (this.prendas[i] != null && this.prendas[i].equals(p)) {
                    for (int j = i; j < this.prendas.length - 1; j++) {
                        if (this.prendas[j + 1] != null) {
                            this.prendas[j] = this.prendas[j + 1];
                            this.prendas[j + 1] = null;
                        }
                    }
                }
            }
        }
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Caja{" +
                "prendas=" + Arrays.toString(prendas) +
                ", indice_prendas=" + indice_prendas +
                '}';
    }
}
