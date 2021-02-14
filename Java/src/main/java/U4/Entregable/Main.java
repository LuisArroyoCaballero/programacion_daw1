package U4.Entregable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*CREACION DE EMPRESA*/

        Empresa empresa1 = new Empresa("Everis");

        /*CREACION DE DEPARTAMENTOS*/

        Departamento departamento1 = new Departamento("Tecnologia",34);
        Departamento departamento2 = new Departamento("Desarrollo","Isla Cartuja",34);
        Departamento departamento3 = new Departamento("Desarrollo","Sevilla",34);

        /*CREACION DE EMPLEADOS*/

        Empleado empleado1_1 = new Empleado("Alfredo Jimenez",1111,111111111,1,1,2021, Empleado.TipoEmpleado.TECNICO);
        Empleado empleado1_2 = new Empleado("Julian Pozo",2222,222222222,2,2,2022, Empleado.TipoEmpleado.DIRECTIVO);
        Empleado empleado1_3 = new Empleado("Guillermo Castillon",3333,333333333,3,3,2023,Empleado.TipoEmpleado.ADMINISTRATIVO);

        Empleado empleado2_1 = new Empleado("Tomas Jimenez",4444,444444444,4,4,2024, Empleado.TipoEmpleado.DIRECTIVO);
        Empleado empleado2_2 = new Empleado("Luis Pozo",5555,555555555,5,5,2025,Empleado.TipoEmpleado.ADMINISTRATIVO);
        Empleado empleado2_3 = new Empleado("Manuel Castillon",6666,666666666,6,6,2026);

        Empleado empleado3_1 = new Empleado("Antonio Jimenez",7777,777777777,7,7,2027,Empleado.TipoEmpleado.ADMINISTRATIVO);
        Empleado empleado3_2 = new Empleado("Alberto Pozo",8888,888888888,8,8,2028, Empleado.TipoEmpleado.DIRECTIVO);
        Empleado empleado3_3 = new Empleado("Roberto Castillon",9999,999999999,9,9,2029);

        /*ADD DEPARTAMENTOS EN LAS EMPRESAS*/

        empresa1.Add_dept(departamento1);
        empresa1.Add_dept(departamento3);
        empresa1.Add_dept(departamento2);

        /*ADD EMPLEADOS EN EL DEPARTAMENTO 1*/

        departamento1.addEmpleado(empleado1_1);
        departamento1.addEmpleado(empleado1_2);
        departamento1.addEmpleado(empleado1_3);

        /*ADD EMPLEADOS EN EL DEPARTAMENTO 2*/

        departamento2.addEmpleado(empleado2_1);
        departamento2.addEmpleado(empleado2_2);
        departamento2.addEmpleado(empleado2_3);

        /*ADD EMPLEADOS EN EL DEPARTAMENTO 3*/

        departamento3.addEmpleado(empleado3_1);
        departamento3.addEmpleado(empleado3_2);
        departamento3.addEmpleado(empleado3_3);

        /*PRUEBA QUITAR EMPLEADO*/

        departamento2.delEmpleado(empleado2_2);
        System.out.println(departamento2.mostrarEmpleados());
        departamento2.addEmpleado(empleado2_2);

        /*MOSRTAR INFORMACION*/

        System.out.println(empresa1.mostrarDept());

        System.out.println(departamento1.mostrarEmpleados());
        System.out.println(departamento3.mostrarEmpleados());

    }
}
