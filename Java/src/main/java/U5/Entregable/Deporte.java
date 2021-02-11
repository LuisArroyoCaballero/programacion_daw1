package U5.Entregable;

import java.util.Arrays;
import java.util.Objects;

public abstract class Deporte {
    private String nombre_deporte;
    private String nombre_pabellon;
    private Participante[] participantes = new Participante[0];
    private int indice_participantes = 0;

    public Deporte(String nombre_deporte, String nombre_pabellon){
        setNombre_deporte(nombre_deporte);
        setNombre_pabellon(nombre_pabellon);
    }

    /*NOMBRE DEPORTE*/

    public String getNombre_deporte() {
        return nombre_deporte;
    }

    public void setNombre_deporte(String nombre_deporte) {
        this.nombre_deporte = nombre_deporte;
    }

    /*NOMBRE PABELLON*/

    public String getNombre_pabellon() {
        return nombre_pabellon;
    }

    public void setNombre_pabellon(String nombre_pabellon) {
        this.nombre_pabellon = nombre_pabellon;
    }

    /*PARTICIPANTES*/

    public Participante[] getParticipantes() {
        return participantes;
    }

    /*ADD PARTICIPANTES*/

    public void Add_participantes(Participante p){
        participantes = Arrays.copyOf(participantes,indice_participantes+1);
        participantes[indice_participantes++] = p;

    }

    /*DEL PARTICIPANTES*/

    public void Del_participante(Participante p) {
        if (p != null){
            for (int i = 0; i < this.participantes.length; i++) {
                if (this.participantes[i] != null && this.participantes[i].equals(p)) {
                    for (int j = i; j < this.participantes.length - 1; j++) {
                        if (this.participantes[j + 1] != null) {
                            this.participantes[j] = this.participantes[j + 1];
                            this.participantes[j + 1] = null;
                        }
                    }
                }
            }
            participantes = Arrays.copyOf(participantes, --indice_participantes);
        }
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Deporte{" +
                "nombre_deporte='" + nombre_deporte + '\'' +
                ", nombre_pabellon='" + nombre_pabellon + '\'' +
                '}';
    }

    /*EQUALS PARTICIPANTES*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deporte)) return false;
        Deporte deporte = (Deporte) o;
        return Objects.equals(nombre_deporte, deporte.nombre_deporte) &&
                Objects.equals(nombre_pabellon, deporte.nombre_pabellon) &&
                Arrays.equals(participantes, deporte.participantes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre_deporte, nombre_pabellon);
        result = 31 * result + Arrays.hashCode(participantes);
        return result;
    }

    /*MOSTRAR PARTICIPANTES*/

    public void mostrarParticipantes(){
        System.out.println(Arrays.toString(participantes));
    }
}
