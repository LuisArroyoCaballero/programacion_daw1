package U7.ExamenIntento_1920;

import java.util.HashMap;
import java.util.Set;

public class MainCovid {
    public static void main(String[] args) {
        Medico m1 = new Medico("Berto","Caballos Garcia",12342,"Maria Dolores");
        Medico m2 = new Medico("Alvaro","Baena Gonzalez",23442,"Juan de Dios");
        Medico m3 = new Medico("Carmen","Alvarez Pozo",53454,"Pedro");

        Paciente p1 = new Paciente("Candela",5,10,true,m3,Cepa.L);
        Paciente p2 = new Paciente("Candela",2,2,true,m1,Cepa.M);
        Paciente p3 = new Paciente("Candela",10,4,true,m3,Cepa.M);
        Paciente p4 = new Paciente("Candela",50,200,true,m3,Cepa.N);
        Paciente p5 = new Paciente("Candela",1,54,true,m2,Cepa.L);
        Paciente p6 = new Paciente("Candela",16,39,true,m1,Cepa.M);
        Paciente p7 = new Paciente("Candela",17,1000,true,m3,Cepa.N);
        Paciente p8 = new Paciente("Candela",13,300,true,m1,Cepa.M);
        Paciente p9 = new Paciente("Candela",78,4,true,m2,Cepa.M);
        Paciente p10 = new Paciente("Candela",45,1,true,m2,Cepa.L);

        Coronavirus covid = new Coronavirus(new HashMap<Cepa, Set<Paciente>>(),"COVID-19");
        covid.addPaciente(Cepa.L,p1);
        covid.addPaciente(Cepa.M,p2);
        covid.addPaciente(Cepa.M,p3);
        covid.addPaciente(Cepa.N,p4);
        covid.addPaciente(Cepa.L,p5);
        covid.addPaciente(Cepa.M,p6);
        covid.addPaciente(Cepa.N,p7);
        covid.addPaciente(Cepa.M,p8);
        covid.addPaciente(Cepa.M,p9);
        covid.addPaciente(Cepa.L,p10);

        covid.pacientesPorEdad(Cepa.L);
        covid.pacientesPorPeso(Cepa.M);

        covid.pacientesDeUnDoctor(23442);
        covid.darDeAltaPaciente(p3);
        covid.cargarPacientes();
    }
}
