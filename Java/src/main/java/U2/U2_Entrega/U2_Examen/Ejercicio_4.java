package U2.U2_Entrega.U2_Examen;
//Ejercicio 4
//Realiza un simulador de máquina tragaperras simplificada que cumpla los
//siguientes requisitos:
//
//a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
//figuras posibles: corazón, diamante, herradura, campana y limón.
//b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
//ha perdido
//c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
//ha recuperado su moneda
//d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
//10 monedas
//
//Ejemplo 1:
//diamante diamante limón
//Bien, ha recuperado su moneda
//
//Ejemplo 2:
//herradura campana diamante
//Lo siento, ha perdido
//
//Ejemplo 3:
//corazón corazón corazón
//Enhorabuena, ha ganado 10 monedas


import java.lang.Math;

public class Ejercicio_4 {
    public static void main(String arg[]) {
        int figura=0;
        int almacen_1 = 0;
        int almacen_2 = 0;
        int almacen_3 = 0;

        while (figura!=3){
            int random = (int)(Math.random()*5);
            if (random==0){
                System.out.print("Diamante ");
            }
            if (random==1){
                System.out.print("Corazon ");
            }
            if (random==2){
                System.out.print("Herradura ");
            }
            if (random==3){
                System.out.print("Campana ");
            }
            if (random==4){
                System.out.print("Limon ");
            }
            if (figura==0){
                almacen_1=random;
            }
            if (figura==1){
                almacen_2=random;
            }
            if (figura==2){
                almacen_3=random;
            }
            System.out.println("");
            figura++;
        }

        if (almacen_1 == almacen_2 && almacen_1 == almacen_3 && almacen_2 == almacen_3){
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        }
        else if (almacen_1 != almacen_2 && almacen_1 != almacen_3 && almacen_2 != almacen_3){
            System.out.println("Lo siento, ha perdido");
        }
        else {
            System.out.println("Bien, ha recuperado su moneda");
        }

    }
}
