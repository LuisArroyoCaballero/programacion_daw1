package U4.Entregable;

import java.util.Arrays;

public class Empresa {
    private String nombre;
    private Departamento[] departamentos = new Departamento[0];
    private int indice_dept = 0;

    public Empresa(String nombre) {
        setNombre(nombre);
    }

    /*NOMBRE EMPRESA*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*GET DEPARTAMENTO*/

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    /*GET NUM DEPARTAMENTOS*/

    public int getIndice_dept() {
        return indice_dept;
    }

    /*ADD DEPARTAMENTO*/

    public void Add_dept(Departamento d){
        departamentos = Arrays.copyOf(departamentos,indice_dept+1);
        departamentos[indice_dept++] = d;

    }


    /*MOSTRAR DEPARTAMENTOS*/

    public String mostrarDept() {
        return "Empresa{" +
                "departamentos=" + Arrays.toString(departamentos) +
                '}';
    }

    /*MOSTRAR NUMERO DEPARTAMENTOS*/

    public void mostrarNumDepts(){
        System.out.println(getIndice_dept());
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }
}
