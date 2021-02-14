package U4.Entregable;

import java.util.Calendar;

public class Empleado {
    private String nombre_apellidos;
    private int numero_SS;
    private int telefono;
    private Calendar fecha_entrada = Calendar.getInstance();
    private int dia;
    private int mes;
    private int year;
    private TipoEmpleado tipo;

    public enum TipoEmpleado {
        ADMINISTRATIVO,
        TECNICO,
        DIRECTIVO
    }

    /*CONSTRUCTOR DEFAULT*/

    public Empleado(String nombre_apellidos, int numero_SS, int telefono, int dia, int mes, int year){
        setNombre_apellidos(nombre_apellidos);
        setNumero_SS(numero_SS);
        setTelefono(telefono);
        setTipo(TipoEmpleado.TECNICO);
        setFecha_entrada(dia,mes,year);
    }


    /*CONSTRUCTOR COMPLETO*/

    public Empleado(String nombre_apellidos, int numero_SS, int telefono, int dia, int mes, int year, TipoEmpleado tipo){
        setNombre_apellidos(nombre_apellidos);
        setNumero_SS(numero_SS);
        setTelefono(telefono);
        setTipo(tipo);
        setFecha_entrada(dia,mes,year);
    }

    /*NOMBRE APELLIDOS*/

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public void setNombre_apellidos(String nombre_apellidos) {
        this.nombre_apellidos = nombre_apellidos;
    }


    /*NUMERO SEGURIDAD SOCIAL*/

    public int getNumero_SS() {
        return numero_SS;
    }

    public void setNumero_SS(int numero_SS) {
        this.numero_SS = numero_SS;
    }


    /*NUMERO TELEFONO*/

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /*FECHA ENTRADA*/

    public Calendar getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(int dia, int mes, int year) {
        this.fecha_entrada.set(year, mes, dia);
    }


    /*TIPO EMPLEADO*/

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    /*MOSTRAR DATOS EMPLEADOS*/

    public String mostrarDatosEmpleados() {
        return "Empleado{" +
                "nombre_apellidos='" + nombre_apellidos + '\'' +
                ", numero_SS=" + numero_SS +
                ", telefono=" + telefono +
                //", fecha_entrada=" + fecha_entrada +
                ", tipo=" + tipo +
                '}';
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre_apellidos='" + nombre_apellidos + '\'' +
                ", numero_SS=" + numero_SS +
                ", telefono=" + telefono +
                ", tipo=" + tipo +
                '}';
    }
}
