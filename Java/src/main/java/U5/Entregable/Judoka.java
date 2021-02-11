package U5.Entregable;

public class Judoka extends Participante implements Luchar{
    private int  peso_categoria;

    public Judoka(String nombre_atleta,int edad_atleta, int peso_categoria){
        super(nombre_atleta,edad_atleta);
        setPeso_categoria(peso_categoria);
    }

    /*PESO CATEGORIA*/

    public int getPeso_categoria() {
        return peso_categoria;
    }

    public void setPeso_categoria(int peso_categoria) {
        this.peso_categoria = peso_categoria;
    }

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+getNombre_atleta()+" como judoka, juro los valores deportivos mundiales.");
    }

    /*LUCHAR*/

    public void luchar(){
        System.out.println("Voy a pelear");
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Judoka{" +
                "peso_categoria=" + peso_categoria +
                ", nombre_atleta='" + nombre_atleta + '\'' +
                ", edad_atleta=" + edad_atleta +
                '}';
    }
}
