package U4.T1.Ej1_CuentaCorriente;

import U4.T1.Ejercicio_6.Banco;

public class main {
    public static void main(String[] arg) {
        Banco b1 = new Banco("Bantander","calle 2", 88282828);
        CuentaCorriente cuenta1 = new CuentaCorriente("Armando Guerra","2222222222R");
        cuenta1.setBanco(b1);

        System.out.println(cuenta1.toString());

        /*cuenta1.mostrarinfo();

        cuenta1.sacar(100);

        cuenta1.ingresar(300);

        cuenta1.mostrarinfo();

        cuenta1.sacar(50);

        cuenta1.mostrarinfo();*/

        /*System.out.println(cuenta1.banco);

        CuentaCorriente.BankNameChange("Bancander");

        System.out.println(cuenta1.banco);

        CuentaCorriente.banco;*/

        /*System.out.println("El nombre del banco es "+CuentaCorriente.banco);
        CuentaCorriente.BankNameChange("Unicaja");
        System.out.println("El nuevo banco es "+CuentaCorriente.banco);
        CuentaCorriente.banco = "LaCaja";
        System.out.println("El nuevo nombre del banco es "+CuentaCorriente.banco);*/



    }
}
