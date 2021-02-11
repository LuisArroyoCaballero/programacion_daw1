package U4.T1.Ejercicio_9.Maquinaria;

class Vagones {
    private double capacidad_maxima;
    private double capacidad_actual;
    private String tipo_mercancia;

    public Vagones(double capacidad_maxima, double capacidad_actual, String tipo_mercancia) {
        setCapacidad_maxima(capacidad_maxima);
        setCapacidad_actual(capacidad_actual);
        setTipo_mercancia(tipo_mercancia);
    }

    /*CAPACIDAD MAXIMA*/

    public double getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(double capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    /*CAPCIDAD ACTUAL*/

    public double getCapacidad_actual() {
        return capacidad_actual;
    }

    public void setCapacidad_actual(double capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }

    /*TIPO MERCANCIA*/

    public String getTipo_mercancia() {
        return tipo_mercancia;
    }

    public void setTipo_mercancia(String tipo_mercancia) {
        this.tipo_mercancia = tipo_mercancia;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Vagones{" +
                "capacidad_maxima=" + capacidad_maxima +
                ", capacidad_actual=" + capacidad_actual +
                ", tipo_mercancia='" + tipo_mercancia + '\'' +
                '}';
    }
}
