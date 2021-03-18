package U7.Entregable;

import U7.ExamenIntento_1920.Cepa;
import U7.ExamenIntento_1920.Paciente;

import java.io.*;
import java.util.*;

public class Instituto {
    private Map<Unidad, Set<Alumno>> clase;

    public Instituto(Map<Unidad, Set<Alumno>> clase) {
        setClase(clase);
    }

    /*SETTER AND GETTER*/

    public Map<Unidad, Set<Alumno>> getClase() {
        return clase;
    }

    public void setClase(Map<Unidad, Set<Alumno>> clase) {
        this.clase = clase;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Instituto{" +
                "clase=" + clase +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instituto)) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(clase, instituto.clase);
    }

    /*METHOD: addAlumnoUnidad()*/

    public void addAlumnoUnidad(Unidad u, Alumno a) {
        if (clase.containsKey(u)) {
            Set<Alumno> conjunto_alumnos = clase.get(u);
            conjunto_alumnos.add(a);
        }
        else {
            Set<Alumno> conjunto_alumnos = new HashSet<Alumno>();
            conjunto_alumnos.add(a);
            clase.put(u,conjunto_alumnos);
        }
    }

    /*METHOD: mostrarTodosAlumnosOrdenados()*/

    public void mostrarTodosAlumnosOrdenados() {
        List<Alumno> conjunto_alumnos = new ArrayList<>();
        for (Unidad u : clase.keySet()) {
            conjunto_alumnos.addAll(clase.get(u));
        }
        Collections.sort(conjunto_alumnos,
                new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno o1, Alumno o2) {
                        return o1.getApellidos().compareTo(o2.getApellidos());
                    }
                });
        System.out.println(conjunto_alumnos);
    }

    /*METHOD: mostrarAlumnosUnidad()*/

    public void  mostrarAlumnosUnidad(Unidad u) {
        List<Alumno> conjunto_alumnos = new ArrayList<>(clase.get(u));
        Collections.sort(conjunto_alumnos,
                new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno o1, Alumno o2) {
                        return o1.getDni().compareTo(o2.getDni());
                    }
                });
        System.out.println(conjunto_alumnos);
    }

    /*METHOD: obtenerUnidadAlumno()*/

    public void obtenerUnidadAlumno(int id_alumno) {
        for (Unidad u : clase.keySet()) {
            for (Alumno a: clase.get(u)) {
                if (a.getId() == id_alumno) {
                    System.out.println(u.getCurso());
                }
            }
        }
    }

    /*METHOD: cargarAlumnos()*/

    public void cargarAlumnos() {
        ObjectInputStream fichero = null;
        try {
            fichero = new ObjectInputStream(new FileInputStream("Ficheros//Entregable_U7_Luis_alumnos.dat"));
            while (true){
                clase = (Map<Unidad, Set<Alumno>>) fichero.readObject();
                System.out.println(clase);
            }
        }
        catch (IOException | ClassNotFoundException ex) {
            ex.getMessage();
        }
        finally {
            try {
                if (fichero != null){
                    fichero.close();
                }
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /*METHOD: guardarAlumnos()*/

    public void guardarAlumnos() {
        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("Ficheros//Entregable_U7_Luis_alumnos.dat"))){
            fichero.writeObject(clase);
        }
        catch (IOException ex) {
            ex.getMessage();
        }
    }

}
