package U7.ExamenIntento_1920;

import java.util.Objects;

public class Medico {

    /*ATRIBUTES*/

    private String nombre_medico;
    private String apellidos_medico;
    private int numero_colegiado;
    private String hospital_medico;

    /*CONSTRUCTOR*/

    public Medico(String nombre_medico, String apellidos_medico, int numero_colegiado, String hospital_medico) {
        this.nombre_medico = nombre_medico;
        this.apellidos_medico = apellidos_medico;
        this.numero_colegiado = numero_colegiado;
        this.hospital_medico = hospital_medico;
    }

    /*GETTER*/

    public String getNombre_medico() {
        return nombre_medico;
    }

    public String getApellidos_medico() {
        return apellidos_medico;
    }

    public int getNumero_colegiado() {
        return numero_colegiado;
    }

    public String getHospital_medico() {
        return hospital_medico;
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medico)) return false;
        Medico medico = (Medico) o;
        return numero_colegiado == medico.numero_colegiado &&
                Objects.equals(nombre_medico, medico.nombre_medico) &&
                Objects.equals(apellidos_medico, medico.apellidos_medico) &&
                Objects.equals(hospital_medico, medico.hospital_medico);
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Medico{" +
                "nombre_medico='" + nombre_medico + '\'' +
                ", apellidos_medico='" + apellidos_medico + '\'' +
                ", numero_colegiado=" + numero_colegiado +
                ", hospital_medico='" + hospital_medico + '\'' +
                '}';
    }
}
