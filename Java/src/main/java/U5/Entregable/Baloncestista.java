package U5.Entregable;

public class Baloncestista extends Participante implements Encestar{
    private double altura;

    public Baloncestista(String nombre_atleta,int edad_atleta, double altura){
        super(nombre_atleta,edad_atleta);
        setAltura(altura);

    }

    /*METODO ABSTRACTO*/

    @Override
    public void hacerjuramento() {
        System.out.println("Yo "+getNombre_atleta()+" como jugador de baloncesto, juro los valores deportivos mundiales.");
    }

    /*ALTURA*/

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /*ENCESTAR*/

    public void encestar(){
        System.out.println("2 puntos!!!!!");
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Baloncestista{" +
                "altura=" + altura +
                ", nombre_atleta='" + nombre_atleta + '\'' +
                ", edad_atleta=" + edad_atleta +
                '}';
    }
}
