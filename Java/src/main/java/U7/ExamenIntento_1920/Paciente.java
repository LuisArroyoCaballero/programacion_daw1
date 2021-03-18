package U7.ExamenIntento_1920;

import java.io.Serializable;
import java.util.Objects;

public class Paciente implements Serializable {

    /*ATRIBUTES*/

    private String nombre_paciente;
    private int edad_paciente;
    private double peso_paciente;
    private boolean vacunas_paciente;
    private Medico medico;
    private Cepa cepa;

    /*CONSTRUCTOR*/

    public Paciente(String nombre_paciente, int edad_paciente, double peso_paciente, boolean vacunas_paciente, Medico medico, Cepa cepa) {
        this.nombre_paciente = nombre_paciente;
        this.edad_paciente = edad_paciente;
        this.peso_paciente = peso_paciente;
        this.vacunas_paciente = vacunas_paciente;
        this.medico = medico;
        this.cepa = cepa;
    }

    /*GETTER*/

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public int getEdad_paciente() {
        return edad_paciente;
    }

    public double getPeso_paciente() {
        return peso_paciente;
    }

    public boolean isVacunas_paciente() {
        return vacunas_paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Cepa getCepa() {
        return cepa;
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente paciente = (Paciente) o;
        return edad_paciente == paciente.edad_paciente &&
                Double.compare(paciente.peso_paciente, peso_paciente) == 0 &&
                vacunas_paciente == paciente.vacunas_paciente &&
                Objects.equals(nombre_paciente, paciente.nombre_paciente) &&
                Objects.equals(medico, paciente.medico) &&
                cepa == paciente.cepa;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre_paciente='" + nombre_paciente + '\'' +
                ", edad_paciente=" + edad_paciente +
                ", peso_paciente=" + peso_paciente +
                ", vacunas_paciente=" + vacunas_paciente +
                ", medico=" + medico +
                ", cepa=" + cepa +
                '}';
    }
}
