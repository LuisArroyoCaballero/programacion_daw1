package U7.U7_Entregable;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*CREACION UNIDADES*/

        Unidad u1 = new Unidad("2ºA");
        Unidad u2 = new Unidad("2ºC");
        Unidad u3 = new Unidad("2ºB");


        /*CREACION ALUMNOS*/

        Alumno a1 = new Alumno("Julio","Suarez","11111111A",u1);
        Alumno a2 = new Alumno("Berto","Romero","22222222B",u3);
        Alumno a3 = new Alumno("Ernesto","Sevilla","33333333C",u3);
        Alumno a4 = new Alumno("Eva","Ugarte","44444444D",u2);
        Alumno a5 = new Alumno("Andreu","Buenafuente","55555555E",u1);
        Alumno a6 = new Alumno("Raul","Cimas","66666666F",u2);
        Alumno a7 = new Alumno("Javier","Coronas","7777777G",u3);
        Alumno a8 = new Alumno("David","Broncano","88888888H",u1);
        Alumno a9 = new Alumno("Silvia","Abril","99999999I",u1);
        Alumno a10 = new Alumno("Joaquin","Reyes","11110000J",u2);

        /*CREACION INSTITUTO*/

        Instituto i1 = new Instituto(new HashMap<Unidad, Set<Alumno>>());

        /*ADD ALUMNOS*/

        i1.addAlumnoUnidad(u1,a1);
        i1.addAlumnoUnidad(u1,a5);
        i1.addAlumnoUnidad(u3,a2);
        i1.addAlumnoUnidad(u2,a6);
        i1.addAlumnoUnidad(u3,a3);
        i1.addAlumnoUnidad(u3,a7);
        i1.addAlumnoUnidad(u1,a9);
        i1.addAlumnoUnidad(u1,a8);
        i1.addAlumnoUnidad(u2,a10);
        i1.addAlumnoUnidad(u2,a4);

        /*MOSTRAR*/

        i1.mostrarTodosAlumnosOrdenados();
        i1.obtenerUnidadAlumno(1);
        i1.mostrarAlumnosUnidad(u2);

        /*WRITE*/

        i1.guardarAlumnos();

        /*LEER*/

        i1.cargarAlumnos();

    }
}
