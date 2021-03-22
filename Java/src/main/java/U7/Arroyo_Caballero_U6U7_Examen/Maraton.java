package U7.Arroyo_Caballero_U6U7_Examen;

import java.io.*;
import java.util.*;

public class Maraton implements Serializable{
    private Map<Dorsal,Atleta> mapa_atleta;

    /*CONSTRUCTOR*/

    public Maraton(Map<Dorsal, Atleta> mapa_atleta) {
        setMapa_atleta(mapa_atleta);
    }

    /*SET AND GET*/

    public Map<Dorsal, Atleta> getMapa_atleta() {
        return mapa_atleta;
    }

    public void setMapa_atleta(Map<Dorsal, Atleta> mapa_atleta) {
        this.mapa_atleta = mapa_atleta;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "Maraton{" +
                "mapa_atleta=" + mapa_atleta +
                '}';
    }

    /*EQUALS*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maraton)) return false;
        Maraton maraton = (Maraton) o;
        return Objects.equals(mapa_atleta, maraton.mapa_atleta);
    }

    /*METHOD: inscribirAtleta()*/

    public void inscribirAtleta(Atleta a) {
        if (!mapa_atleta.containsValue(a)) {
            Dorsal nuevo_dorsal = new Dorsal();
            mapa_atleta.put(nuevo_dorsal,a);
            a.setDorsal(nuevo_dorsal);
        } else {
            System.out.println("Este atleta ya esta inscrito.");
        }
    }

    /*METHOD: guardarTiempo()*/

    public void guardarTiempo(Dorsal d, int marca) {
        if (mapa_atleta.containsKey(d)){
            mapa_atleta.get(d).setMarca(marca);
            mapa_atleta.get(d).setFinisher(true);
        }
    }

    /*METHOD: borrarAtleta()*/

    public void borrarAtleta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el dorsal del atleta a borrar.");
        int dorsal = sc.nextInt();

        for (Dorsal d : mapa_atleta.keySet()) {
            if (d.getDorsal() == dorsal) {
                mapa_atleta.remove(d);
                break;
            }
        }
    }

    /*METHOD: mostrarListaFinishers()*/

    public void mostrarListaFinishers() {
        List<Atleta> lista_atletas = new ArrayList<>();
        for (Dorsal d : mapa_atleta.keySet()) {
            if (mapa_atleta.get(d).isFinisher()) {
                lista_atletas.add(mapa_atleta.get(d));
            }
        }
        Collections.sort(lista_atletas,
                new Comparator<Atleta>() {
                    @Override
                    public int compare(Atleta o1, Atleta o2) {
                        return o1.getMarca() - o2.getMarca();
                    }
                });
        System.out.println(lista_atletas);
    }

    /*METHOD: mostrarListaCategoria()*/

    public void mostrarListaCategoria(Categoria c) {
        List<Atleta> lista_atletas = new ArrayList<>();
        for (Dorsal d : mapa_atleta.keySet()) {
            if (mapa_atleta.get(d).getCategoria() == c) {
                lista_atletas.add(mapa_atleta.get(d));
            }
        }
        Collections.sort(lista_atletas,
                new Comparator<Atleta>() {
                    @Override
                    public int compare(Atleta o1, Atleta o2) {
                        return o1.getMarca() - o2.getMarca();
                    }
                });
        System.out.println(lista_atletas);
    }

    /*METHOD: participantesPorPais()*/

    public void participantesPorPais(String pais) {
        int contador_paises = 0;
        for (Dorsal d : mapa_atleta.keySet()) {
            if (mapa_atleta.get(d).getPais().equals(pais)) {
                contador_paises++;
            }
        }
        System.out.println(contador_paises);
    }

    /*METHOD: cargarAtletas()*/

    public void cargarAtletas() {
        ObjectInputStream fichero = null;

        try {
            fichero = new ObjectInputStream(new FileInputStream("Ficheros//maraton.dat"));
            while (true) {
                mapa_atleta = (Map<Dorsal,Atleta>) fichero.readObject();
                System.out.println(mapa_atleta);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.getMessage();
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    /*METHOD: guardarAtletas()*/

    public void guardarAtletas() {
        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("Ficheros//maraton.dat"))) {
            fichero.writeObject(mapa_atleta);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
