package U4.T1.Ejercicio_9.Maquinaria;

import U4.T1.Ejercicio_9.Personal.Mecanicos;

public class Locomotoras {
    private String matricula;
    private double potencia;
    private int year_fabricacion;
    private Mecanicos mecanico;

    public Locomotoras(String matricula, double potencia, int year_fabricacion, Mecanicos mecanico) {
        setMatricula(matricula);
        setPotencia(potencia);
        setYear_fabricacion(year_fabricacion);
        setMecanico(mecanico);
    }

    /*MATRICULA*/

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /*POTENCIA*/

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /*AÑO FABRICACION*/

    public int getYear_fabricacion() {
        return year_fabricacion;
    }

    public void setYear_fabricacion(int year_fabricacion) {
        this.year_fabricacion = year_fabricacion;
    }

    /*MECANICO*/

    public Mecanicos getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanicos mecanico) {
        this.mecanico = mecanico;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", year_fabricacion=" + year_fabricacion +
                ", mecanico=" + mecanico +
                '}';
    }
}
