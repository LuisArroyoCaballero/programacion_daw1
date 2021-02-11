package U4.T1.Ej1_CuentaCorriente;
//Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son:
// saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero), nombre y
// DNI del titular. Las operaciones típicas con una cuenta corriente son:
//
//-Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0 y el límite de descubierto será de
// -50 euros.
//
//-Sacar dinero: solo se podrá sacar dinero hasta el limite de descubierto. El método debe indicar, por pantalla,
// un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver un valor booleano
// que indique lo mismo.
//
//-Ingresar dinero: se incrementa el saldo.
//
//-Mostrar información: muestra la información de la cuenta corriente.

import U4.T1.Ejercicio_6.Banco;

public class CuentaCorriente{
    public String nombre;
    protected String dni;
    private double saldo;
    private double limite;
    private Banco banco;

    public CuentaCorriente(String nombre, String dni){
        setSaldo(0);
        setLimite(-50);
        setNombre(nombre);
        setDNI(dni);

    }

    public CuentaCorriente(double saldo){
        setSaldo(saldo);
        setLimite(0);
    }

    public CuentaCorriente(double saldo,double limite, String dni){
        setSaldo(saldo);
        setLimite(limite);
        setDNI(dni);
    }

    /*SALDO*/

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    private double getSaldo(){
        return saldo;
    }

    /*LIMITE*/

    private void setLimite(double limite){
        this.limite = limite;
    }

    private double getLimite(){
        return limite;
    }

    /*NOMBRE*/

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getNombre(){
        return nombre;
    }

    /*DNI*/

    private void setDNI(String dni) {
        this.dni = dni;
    }

    private String getDNI(){
        return dni;
    }

    /*NOMBRE BANCO*/

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    /*SACAR DINERO*/

    boolean sacar(double cant){
        boolean VerTransaccion;

        if ((saldo - cant) >= limite){
            this.saldo -= cant;
            VerTransaccion = true;
        }
        else{
            System.out.println("La transacción no puede ser realizada.");
            VerTransaccion = false;
        }
        return VerTransaccion;
    }

    /*INGRESAR DINERO*/

    void ingresar(double cant){
        this.saldo += cant;
    }

    /*MOSTRAR INFO*/

    @Override
    public String toString() {
        if (banco==null) {
            return "CuentaCorriente{" +
                    "nombre='" + nombre + '\'' +
                    ", dni='" + dni + '\'' +
                    ", saldo=" + saldo +
                    ", limite=" + limite +
                    ", No hay banco vinculado}";
        }
        else{
            return "CuentaCorriente{" +
                    "nombre='" + nombre + '\'' +
                    ", dni='" + dni + '\'' +
                    ", saldo=" + saldo +
                    ", limite=" + limite +
                    ", banco=" + banco +
                    '}';
        }
    }
}
