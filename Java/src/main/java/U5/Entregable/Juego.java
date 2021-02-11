package U5.Entregable;

import U4.T2.Minecraft_Examen_1920.Material;

import java.util.Arrays;
import java.util.Comparator;

public class Juego {
    private int year;
    private String sede;
    private Pais[] paises = new Pais[0];
    private Deporte[] deportes = new Deporte[0];
    private int indice_paises = 0;
    private int indice_deportes = 0;

    public Juego(int year, String sede){
        setYear(year);
        setSede(sede);

    }

    /*YEAR*/

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year%4==0) {
            this.year = year;
        }
        else {
            System.out.println("Introduzca un multipo de 4 en el atributo 'year'.");
        }
    }

    /*SEDE*/

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    /*PAISES*/

    public Pais[] getPaises() {
        return paises;
    }

    /*DEPORTE*/

    public Deporte[] getDeportes() {
        return deportes;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Juego{" +
                "year=" + year +
                ", sede='" + sede + '\'' +
                ", paises=" + Arrays.toString(paises) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }

    /*ADD COUNTRIES*/

    public void Add_country(Pais p){
        paises = Arrays.copyOf(paises,indice_paises+1);
        paises[indice_paises++] = p;

    }

    /*DEL COUNTRIES*/

    public void Del_country(Pais p) {
       if (p != null){
           for (int i = 0; i < this.paises.length; i++) {
                if (this.paises[i] != null && this.paises[i].equals(p)) {
                    for (int j = i; j < this.paises.length - 1; j++) {
                        if (this.paises[j + 1] != null) {
                            this.paises[j] = this.paises[j + 1];
                            this.paises[j + 1] = null;
                        }
                    }
                }
            }
           paises = Arrays.copyOf(paises, --indice_paises);
       }
    }

    /*ADD DEPORTES*/

    public void Add_deporte(Deporte d){
        deportes = Arrays.copyOf(deportes,indice_deportes+1);
        deportes[indice_deportes++] = d;

    }

    /*DEL DEPORTES*/

    public void Del_deporte(Deporte d) {
        if (d != null){
            for (int i = 0; i < this.deportes.length; i++) {
                if (this.deportes[i] != null && this.deportes[i].equals(d)) {
                    for (int j = i; j < this.deportes.length - 1; j++) {
                        if (this.deportes[j + 1] != null) {
                            this.deportes[j] = this.deportes[j + 1];
                            this.deportes[j + 1] = null;
                        }
                    }
                }
            }
            deportes = Arrays.copyOf(deportes, --indice_deportes);
        }
    }

    /*MOSTRAR PAISES*/

    public class comparaPaises_participantes implements Comparator {
        public int compare(Object p1, Object p2){
            Pais pais1 = (Pais) p1;
            Pais pais2 = (Pais) p2;

            return pais2.getNum_participantes() - pais1.getNum_participantes();

        }
    }

    public void mostrarPaises(){
        comparaPaises_participantes c = new comparaPaises_participantes();
        Arrays.sort(paises,c);
        System.out.println(Arrays.toString(paises));
    }

    /*MOSTRAR PAISES NOMBRE*/

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(paises);
        System.out.println(Arrays.toString(paises));
    }




}
