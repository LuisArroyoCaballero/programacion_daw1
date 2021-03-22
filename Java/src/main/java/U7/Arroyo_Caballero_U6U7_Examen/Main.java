package U7.Arroyo_Caballero_U6U7_Examen;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*CONTRUCTOR MARATON*/

        Maraton m1 = new Maraton(new HashMap<>());

        /*CONSTRUCCIONES DE ATLETAS*/

        Atleta a1 = new Atleta("Alberto", "Espania", Categoria.JUNIOR);
        Atleta a2 = new Atleta("Blanca", "Espania", Categoria.VETERANO);
        Atleta a3 = new Atleta("Camelia", "Espania", Categoria.SENIOR);
        Atleta a4 = new Atleta("Daniel", "Inglaterra", Categoria.JUNIOR);
        Atleta a5 = new Atleta("Eduardo", "Alemania", Categoria.VETERANO);
        Atleta a6 = new Atleta("Francisco", "Alemania", Categoria.SENIOR);
        Atleta a7 = new Atleta("Gonzalo", "Japon", Categoria.JUNIOR);
        Atleta a8 = new Atleta("Hugo", "China", Categoria.VETERANO);
        Atleta a9 = new Atleta("Ivan", "Espania", Categoria.SENIOR);
        Atleta a10 = new Atleta("Jaime", "Francia", Categoria.JUNIOR);
        Atleta a11 = new Atleta("Kira", "Francia", Categoria.VETERANO);
        Atleta a12 = new Atleta("Luis", "Suecia", Categoria.SENIOR);
        Atleta a13 = new Atleta("Maria", "Suiza", Categoria.JUNIOR);
        Atleta a14 = new Atleta("Nerea", "Ucrania", Categoria.VETERANO);
        Atleta a15 = new Atleta("Oscar", "Estados Unidos", Categoria.SENIOR);

        /*METODO: inscribirAtleta()*/

        m1.inscribirAtleta(a1);
        m1.inscribirAtleta(a2);
        m1.inscribirAtleta(a3);
        m1.inscribirAtleta(a4);
        m1.inscribirAtleta(a5);
        m1.inscribirAtleta(a6);
        m1.inscribirAtleta(a7);
        m1.inscribirAtleta(a8);
        m1.inscribirAtleta(a9);
        m1.inscribirAtleta(a10);
        m1.inscribirAtleta(a11);
        m1.inscribirAtleta(a12);
        m1.inscribirAtleta(a13);
        m1.inscribirAtleta(a14);
        m1.inscribirAtleta(a15);


        /*METODO: guardarTiempo()*/

        m1.guardarTiempo(a1.getDorsal(),1);
        m1.guardarTiempo(a2.getDorsal(),1);
        m1.guardarTiempo(a3.getDorsal(),17);
        m1.guardarTiempo(a4.getDorsal(),21);
        m1.guardarTiempo(a5.getDorsal(),50);
        m1.guardarTiempo(a6.getDorsal(),130);
        m1.guardarTiempo(a7.getDorsal(),80);
        m1.guardarTiempo(a8.getDorsal(),70);
        m1.guardarTiempo(a9.getDorsal(),23);
        m1.guardarTiempo(a10.getDorsal(),32);


        /*METODO: borrarAtleta()*/

        m1.borrarAtleta();

        /*METODO: mostrarListaFinishers()*/

        m1.mostrarListaFinishers();

        /*METODO: mostrarListaCategoria()*/

        m1.mostrarListaCategoria(Categoria.JUNIOR);

        /*METODO: participantesPorPais()*/

        m1.participantesPorPais("Espania");

        /*METODO: guardarAtletas()*/

        m1.guardarAtletas();

        /*METODO: cargarAtletas()*/

        m1.cargarAtletas();
    }
}
