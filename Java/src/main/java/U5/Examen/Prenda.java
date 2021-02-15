package U5.Examen;

import java.util.Objects;

public class Prenda implements Devolver,Doblar {
    private double precio;
    private String nombre;
    private int cod_barras;
    private double peso;

    public Prenda(double precio, String nombre, int cod_barras, double peso){
        setPrecio(precio);
        setNombre(nombre);
        setCod_barras(cod_barras);
        setPeso(peso);
    }

    /*PRECIO*/

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*NOMBRE*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*CODIGO DE BARRAS*/

    public int getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(int cod_barras) {
        this.cod_barras = cod_barras;
    }

    /*PESO*/

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Prenda{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", cod_barras=" + cod_barras +
                ", peso=" + peso +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prenda)) return false;
        Prenda prenda = (Prenda) o;
        return Double.compare(prenda.precio, precio) == 0 &&
                cod_barras == prenda.cod_barras &&
                Double.compare(prenda.peso, peso) == 0 &&
                Objects.equals(nombre, prenda.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, nombre, cod_barras, peso);
    }

    /*DEVOLVER*/

    @Override
    public void devolver() {
        System.out.println("Devolviendo la prenda con nombre "+getNombre()+" y precio "+getPrecio());
    }

    /*DOBLAR*/

    @Override
    public void doblar() {
        System.out.println("La prenda "+getNombre()+ " se puede doblar");
    }
}
