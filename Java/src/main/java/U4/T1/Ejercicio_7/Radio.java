package U4.T1.Ejercicio_7;

public class Radio {
    double frecuencia;

    Radio(){
        setFrecuencia(80);
    }

    /*Set & Get*/

    private void setFrecuencia(double frecuencia){
        if(frecuencia>=80 && frecuencia<=180){
            this.frecuencia=frecuencia;
        }
    }

    double getFrecuencia(){
        return this.frecuencia;
    }

    /*Up & Down*/

    void Up(){
        if (getFrecuencia()<180){
            setFrecuencia(getFrecuencia()+0.5);
        }
        else{
            setFrecuencia(80);

        }
    }

    void Down(){
        if (getFrecuencia()>80){
            setFrecuencia(getFrecuencia()-0.5);
        }
        else{
            setFrecuencia(180);
        }
    }

    /*Display*/

    @Override
    public String toString() {
        return "Radio{" +
                "frecuencia=" + frecuencia + "MHz" +
                '}';
    }
}
