package U4.T2.Minecraft_Examen_1920;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Minecraft minecraft1 = new Minecraft();
        Cristal cris1 = new Cristal(50,40,10,true, Cristal.TipoCristal.TRANSPARENTE);
        Cristal cris2 = new Cristal(60,50,20,true, Cristal.TipoCristal.TRANSPARENTE);
        Cristal cris3 = new Cristal(70,60,30,true, Cristal.TipoCristal.TRANSPARENTE);

        //Anadimos cristales

        minecraft1.Add_material(cris1);
        minecraft1.Add_material(cris3);
        minecraft1.Add_material(cris2);

        ComparaQuemarse comparaQuemarse = new ComparaQuemarse();
        Arrays.sort(minecraft1.getMateriales(), comparaQuemarse);

        //Arrays.sort(minecraft1.getMateriales());

        System.out.println(cris3.toString());

        //Ordenamos cristales por masa

        //minecraft1.



        System.out.println(minecraft1.mostrarEstado());

    }
}
