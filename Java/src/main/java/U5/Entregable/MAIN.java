package U5.Entregable;

import java.util.Arrays;

public class MAIN {
    public static void main(String[] args) {
        Baloncesto baloncesto1 = new Baloncesto("Baloncesto","Alexa",5);


        Atletismo atletismo2 = new Atletismo("Atleta","Alfonso",6);
        Atletismo atletismo4 = new Atletismo("Atleta","Alfonso",6);
        Atletismo atletismo3 = new Atletismo("Baloncesto","Julietta",7);

        Pais pais2 = new Pais("Espana", 2);
        Pais pais4 = new Pais("Espana", 2);
        Pais pais3 = new Pais("Portugal", 3);
        Pais pais1 = new Pais("Alemania", 3);



        Juego j1 = new Juego(9,"Japon");

        j1.Add_country(pais1);
        j1.Add_country(pais2);
        j1.Add_country(pais3);
        j1.Del_country(pais2);

        j1.Add_deporte(baloncesto1);
        j1.Add_deporte(atletismo2);
        j1.Add_deporte(atletismo3);
        j1.Del_deporte(atletismo2);



        Baloncestista bal1 = new Baloncestista("jorge", 10, 1.94);
        Atleta atleta1 = new Atleta("Pedro",20,"Salto");
        Judoka judoka1 = new Judoka("Yuri", 30, 70);
        bal1.hacerjuramento();
        atleta1.hacerjuramento();
        judoka1.hacerjuramento();

        atletismo2.Add_participantes(bal1);
        atletismo2.Add_participantes(atleta1);
        atletismo2.Add_participantes(judoka1);
        atletismo2.Del_participante(atleta1);
        atletismo2.mostrarParticipantes();

        bal1.encestar();
        atleta1.correr();
        judoka1.luchar();

        j1.mostrarPaises();

        System.out.println(j1.toString());

        j1.mostrarPaisesParaCeremonia();
    }
}
