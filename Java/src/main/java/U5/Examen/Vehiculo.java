package U5.Examen;

public abstract class Vehiculo implements Comparable{
    private String matricula;
    private int carga_max;
    private Conductor conductor;
    private int num_tiendas;

    /*CONSTRUCTOR*/

    public Vehiculo(String matricula, int carga_max, Conductor conductor, int num_tiendas){

    }

    /*MATRICULA*/

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /*CARGA MAXIMA*/

    public int getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(int carga_max) {
        this.carga_max = carga_max;
    }

    /*CONDUCTOR*/

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    /*NUMERO DE TIENDAS*/

    public int getNum_tiendas() {
        return num_tiendas;
    }

    public void setNum_tiendas(int num_tiendas) {
        this.num_tiendas = num_tiendas;
    }

    /*METODO ABSTRACTO*/

    public abstract void descargar();

    /*COMPARABLE (compareTo)*/

    public int compareTo(Object o) {
        if (o instanceof Vehiculo){
            Vehiculo vehiculo = (Vehiculo) o;
            return this.getNum_tiendas() - vehiculo.getNum_tiendas();
        }
        else {
            return -1;
        }

    }
}
