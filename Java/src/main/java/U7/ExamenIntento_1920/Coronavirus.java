package U7.ExamenIntento_1920;

import java.io.*;
import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.*;

public class Coronavirus {

    /*ATRIBUTES*/

    private Map<Cepa, Set<Paciente>> infectados;
    private String nombre_cientifico;
    private final String localidad = "Wuhan";

    /*CONSTRUCTOR*/

    public Coronavirus(Map<Cepa, Set<Paciente>> infectados, String nombre_cientifico) {
        this.infectados = infectados;
        this.nombre_cientifico = nombre_cientifico;
    }

    /*GETTER*/

    public Map<Cepa, Set<Paciente>> getInfectados() {
        return infectados;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public String getLocalidad() {
        return localidad;
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coronavirus)) return false;
        Coronavirus that = (Coronavirus) o;
        return Objects.equals(infectados, that.infectados) &&
                Objects.equals(nombre_cientifico, that.nombre_cientifico) &&
                Objects.equals(localidad, that.localidad);
    }


    /*TO STRING*/

    @Override
    public String toString() {
        return "Coronavirus{" +
                "infectados=" + infectados +
                ", nombre_cientifico='" + nombre_cientifico + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }

    /*METHOD: addPaciente*/

    public void addPaciente(Cepa c, Paciente p) {
        if (infectados.containsKey(c)) {
            Set<Paciente> conjunto_pacientes = infectados.get(c);
            conjunto_pacientes.add(p);
        }
        else {
            Set<Paciente> conjunto_pacientes = new HashSet<Paciente>();
            conjunto_pacientes.add(p);
            infectados.put(c,conjunto_pacientes);
        }

    }

    /*METHOD: darDeAltaPaciente*/

    public void darDeAltaPaciente (Paciente p) {
        for (Cepa c : infectados.keySet()) {
            Set<Paciente> conjunto_pacientes = infectados.get(c);
            conjunto_pacientes.remove(p);
        }
    }

    /*METHOD: pacientesDeUnDoctor()*/

    public void pacientesDeUnDoctor(int numero_colegiado) {
        boolean comprobador = false;
        for (Cepa c : infectados.keySet()) {
            for (Paciente p: infectados.get(c)) {
                if (p.getMedico().getNumero_colegiado() == numero_colegiado) {
                    System.out.println(p);
                    comprobador = true;
                }

            }
        }
        if (!comprobador) {
            System.out.println("Este médico/a no lleva ningún paciente");
        }
    }

    /*METHOD: pacientesPorPeso()*/

    public void pacientesPorPeso(Cepa c) {
        List<Paciente> conjunto_pacientes = new ArrayList<>(infectados.get(c));
        Collections.sort(conjunto_pacientes,
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente o1, Paciente o2) {
                    return (int) (o1.getPeso_paciente()- o2.getPeso_paciente());
                }
        });
        System.out.println(conjunto_pacientes);
    }

    /*METHOD: pacientesPorEdad()*/

    public void pacientesPorEdad(Cepa c) {
        List<Paciente> conjunto_pacientes = new ArrayList<>(infectados.get(c));
        Collections.sort(conjunto_pacientes,
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente o1, Paciente o2) {
                        return (int) (o1.getEdad_paciente()- o2.getEdad_paciente());
                    }
                });
        System.out.println(conjunto_pacientes);
    }

    /*METHOD: cargarPacientes()*/

    public void cargarPacientes() {
        try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("Ficheros//U7//pacientes.dat"))){
            infectados = (Map<Cepa, Set<Paciente>>) fichero.readObject();
        }
        catch (IOException | ClassNotFoundException ex) {
            ex.getMessage();
        }
    }

    /*METHOD: guardarPacientes()*/

    public void guardarPacientes() {
        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("Ficheros//U7//pacientes.dat"))){
            fichero.writeObject(infectados);
            System.out.println();
        }
        catch (IOException ex) {
            ex.getMessage();
        }
    }


}
