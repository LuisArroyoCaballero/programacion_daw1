package U4.Entregable;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String nombre_departamento;
    private String sede;
    private int ext_telefono;
    private Empleado[] empleados = new Empleado[0];
    private int indice_empleado = 0;


    /*CONSTRUCTOR DEFAULT*/

    public Departamento(String nombre_departamento, int ext_telefono){
        setNombre_departamento(nombre_departamento);
        setSede("Castilleja");
        setExt_telefono(ext_telefono);
    }

    /*CONSTRUCTOR SEDE COMPLETA*/

    public Departamento(String nombre_departamento, String sede, int ext_telefono){
        setNombre_departamento(nombre_departamento);
        setSede(sede);
        setExt_telefono(ext_telefono);
    }


    /*NOMBRE DEPARTAMENTO*/

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }


    /*SEDE*/

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }


    /*EXTENSION TELEFONO*/

    public int getExt_telefono() {
        return ext_telefono;
    }

    public void setExt_telefono(int ext_telefono) {
        this.ext_telefono = ext_telefono;
    }

    /*GET EMPLEADOS*/

    public Empleado[] getEmpleados() {
        return empleados;
    }

    /*GET NUMERO EMPLEADOS*/

    public int getIndice_empleado() {
        return indice_empleado;
    }

    /*ADD EMPLEADO*/

    public void addEmpleado(Empleado e) {
        empleados = Arrays.copyOf(empleados, indice_empleado+1);
        empleados[indice_empleado++] = e;

    }

    /*DEL EMPLEADO*/

    public void delEmpleado(Empleado e) {
        if (e != null){
            for (int i = 0; i < this.empleados.length; i++) {
                if (this.empleados[i] != null && this.empleados[i].equals(e)) {
                    for (int j = i; j < this.empleados.length - 1; j++) {
                        if (this.empleados[j + 1] != null) {
                            this.empleados[j] = this.empleados[j + 1];
                            this.empleados[j + 1] = null;
                        }
                    }
                }
            }
            empleados = Arrays.copyOf(empleados, --indice_empleado);
        }
    }

    /*EQUALS EMPLEADOS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departamento)) return false;
        Departamento that = (Departamento) o;
        return ext_telefono == that.ext_telefono &&
                Objects.equals(nombre_departamento, that.nombre_departamento) &&
                Objects.equals(sede, that.sede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_departamento, sede, ext_telefono);
    }


    /*MOSTRAR EMPLEADOS*/

    public String mostrarEmpleados() {
        return "Departamento{" +
                "empleados=" + Arrays.toString(empleados) +
                '}';
    }

    /*MOSTRAR NUM EMPLEADOS*/

    public void mostrarNumEmple() {
        System.out.println(getIndice_empleado());
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre_departamento='" + nombre_departamento + '\'' +
                ", sede='" + sede + '\'' +
                ", ext_telefono=" + ext_telefono +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}
