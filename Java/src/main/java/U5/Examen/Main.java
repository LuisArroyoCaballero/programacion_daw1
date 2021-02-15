package U5.Examen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ComparaCarga_max comparaCarga_max = new ComparaCarga_max();

        /*CREACION CONDUCTORES*/

        Conductor cond1 = new Conductor("Alberto", "Garcia",11111);
        Conductor cond2 = new Conductor("Berto", "Garcia",22222);
        Conductor cond3 = new Conductor("Carlos", "Garcia",33333);
        Conductor cond4 = new Conductor("Daniel", "Garcia",33333);
        Conductor cond5 = new Conductor("Eustaquio", "Garcia",33333);
        Conductor cond6 = new Conductor("Francisco", "Garcia",33333);

        /*CREACION DE CAMIONES CAJA*/

        CamionCajas camcaj1 = new CamionCajas("1111AAA",500,cond1,10);
        CamionCajas camcaj2 = new CamionCajas("2222BBB",600,cond2,20);
        CamionCajas camcaj3 = new CamionCajas("3333CCC",700,cond3,30);

        /*CREACION CAMIONES PRENDA*/

        CamionPerchas camper1 = new CamionPerchas("4444DDD",800,cond4,40);
        CamionPerchas camper2 = new CamionPerchas("5555EEE",900,cond4,50);
        CamionPerchas camper3 = new CamionPerchas("6666FFF",1000,cond4,60);

        /*CREACION CAJA*/

        Caja caja1 = new Caja(1);
        Caja caja2 = new Caja(2);
        Caja caja3 = new Caja(3);

        /*CREACION PRENDA GENERAL*/

        Prenda prend_g1 = new Prenda(10,"Albornoz",111,1);
        Prenda prend_g2 = new Prenda(20,"Bufanda",222,2);
        Prenda prend_g3 = new Prenda(30,"Calzoncillos",333,3);

        /*CREACION PRENDAS COLGAR*/

        PrendaColgada prend_col1 = new PrendaColgada(40,"Delantal",444,4,4);
        PrendaColgada prend_col2 = new PrendaColgada(50,"Esquis",555,5,5);
        PrendaColgada prend_col3 = new PrendaColgada(60,"Fular",666,6,6);

        /*ADD CAJA*/



        camcaj1.addCaja(caja3);
        camcaj1.addCaja(caja1);
        camcaj1.addCaja(caja2);

        camcaj2.addCaja(caja2);
        camcaj2.addCaja(caja3);
        camcaj2.addCaja(caja1);

        camcaj3.addCaja(caja3);
        camcaj3.addCaja(caja2);
        camcaj3.addCaja(caja1);

        /*DEL PRENDA*/

        camcaj1.delCaja(caja1);


        /*ADD PRENDA*/

        caja1.addPrenda(prend_g1);
        caja1.addPrenda(prend_g3);
        caja1.addPrenda(prend_g2);

        caja2.addPrenda(prend_g3);
        caja2.addPrenda(prend_g2);
        caja2.addPrenda(prend_g1);

        caja3.addPrenda(prend_g2);
        caja3.addPrenda(prend_g3);
        caja3.addPrenda(prend_g1);

        /*DEL PRENDA*/

        caja2.delPrenda(prend_g2);

        /*ADD PRENDA COLGADA*/

        camper1.addPrendaColgada(prend_col3);
        camper1.addPrendaColgada(prend_col2);
        camper1.addPrendaColgada(prend_col1);

        camper2.addPrendaColgada(prend_col2);
        camper2.addPrendaColgada(prend_col3);
        camper2.addPrendaColgada(prend_col1);

        camper3.addPrendaColgada(prend_col1);
        camper3.addPrendaColgada(prend_col2);
        camper3.addPrendaColgada(prend_col3);

        /*DEL PRENDA COLGADA*/

        camper3.delPrendaColgada(prend_col2);

        /*DESCARGAR*/

        camcaj1.descargar();
        camcaj2.descargar();
        camcaj3.descargar();

        camper1.descargar();
        camper2.descargar();
        camper3.descargar();

        /*ARRAYS CAMIONES*/

        CamionPerchas[] camionPerchas = new CamionPerchas[3];
        camionPerchas[0] = camper2;
        camionPerchas[1] = camper1;
        camionPerchas[2] = camper3;

        CamionCajas[] camionCajas = new CamionCajas[3];
        camionCajas[0] = camcaj2;
        camionCajas[1] = camcaj3;
        camionCajas[2] = camcaj1;

        /*ORDENAR*/

        System.out.println("");
        Arrays.sort(camionCajas);
        System.out.println(camcaj1.toString());

        System.out.println("");
        Arrays.sort(camionPerchas);
        System.out.println(camcaj1.toString());

        System.out.println("");
        Arrays.sort(camionCajas,comparaCarga_max);
        System.out.println(camcaj1.toString());

        /*INTERFACES*/

        System.out.println("");
        prend_col1.devolver();
        prend_g2.devolver();

        System.out.println("");
        prend_col1.doblar();
        prend_g2.doblar();

        System.out.println("");
        prend_col1.colgar();


        /*MOSTRAR*/

        System.out.println(camcaj1);
        System.out.println(camcaj2);
        System.out.println(camcaj3);

        System.out.println(camper1);
        System.out.println(camper2);
        System.out.println(camper3);

    }
}
