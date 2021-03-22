package U7.Arroyo_Caballero_U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Atleta implements Serializable {
    private Dorsal dorsal;
    private String nombre;
    private String pais;
    private int marca = 0;
    private Categoria categoria;
    private boolean finisher = false;

    /*CONSTRUCTOR*/

    public Atleta(String nombre, String pais, Categoria categoria) {
        setNombre(nombre);
        setPais(pais);
        setCategoria(categoria);
    }

    /*SET AND GET*/

    public Dorsal getDorsal() {
        return dorsal;
    }

    public void setDorsal(Dorsal dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Atleta{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atleta)) return false;
        Atleta atleta = (Atleta) o;
        return Double.compare(atleta.marca, marca) == 0 &&
                finisher == atleta.finisher &&
                Objects.equals(dorsal, atleta.dorsal) &&
                Objects.equals(nombre, atleta.nombre) &&
                Objects.equals(pais, atleta.pais) &&
                categoria == atleta.categoria;
    }
}
