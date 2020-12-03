package U3.T3;
//Actividad 4: Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta. La aplicación
//genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
//(siendo n la longitud indicada anteriormente por el usuario).
//El jugador introduce ahora una combinación de prueba.
//En cada intento se mostrará como pista, para cada dígito, si es mayor menor o igual que el correspondiente
//de la combinación secreta.
//
//Ejemplo:
//
//-Introduzca longitud de la clave
//
//-3
//
//(se genera la clave secreta, por ejemplo 152)
//
//-Intente acertarla
//
//-351
//
//-3 es mayor,
//
// 5 es igual,
//
// 1 es menor
//
//- Intente acertarla de nuevo

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la longitud de la clave: ");
        int long_clave = teclado.nextInt();
        teclado.nextLine();
        int[] clave = new int[long_clave];

        for (int i = 0; i < long_clave; i++) {
            clave[i]= (int) (Math.random()*(5-1+1)+1);
            //System.out.print(clave[i]+" ");
        }
        System.out.println("Intente acertarla: ");
        String intento = teclado.nextLine();

        for (int i = 0; i < long_clave; i++){
            if (clave[i] > Integer.parseInt(intento.substring(i,i+1))){
                System.out.println(intento.substring(i,i+1)+" es menor");
            }
            if (clave[i] < Integer.parseInt(intento.substring(i,i+1))){
                System.out.println(intento.substring(i,i+1)+" es mayor");
            }
            if (clave[i] == Integer.parseInt(intento.substring(i,i+1))) {
                System.out.println(intento.substring(i,i+1)+" es igual");
            }


        }


    }
}
