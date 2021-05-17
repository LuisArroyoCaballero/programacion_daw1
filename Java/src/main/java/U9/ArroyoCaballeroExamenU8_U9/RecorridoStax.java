package U9.ArroyoCaballeroExamenU8_U9;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        Libro libroActual = null;
        String tagActual="";

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("Ficheros//U8//Entregable2021//ejercicio2.xml"));

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startTag = xmlEvent.asStartElement();
                    String tagName = startTag.getName().getLocalPart();
                    if (tagName.equals("libro")) {
                        libroActual = new Libro();
                        tagActual = "libro";
                    } else if (tagName.equals("titulo")) {
                        tagActual = "titulo";
                    } else if (tagName.equals("autor")) {
                        tagActual = "autor";
                    } else if (tagName.equals("editorial")) {
                        tagActual = "editorial";
                    } else if (tagName.equals("paginas")) {
                        tagActual = "paginas";
                    }
                } else if (xmlEvent.isCharacters()) {
                    Characters texto = xmlEvent.asCharacters();

                    if (!tagActual.equals("")) {
                        if (tagActual.equals("libro")) {
                            libroActual.setTitulo(texto.getData());
                        } else if (tagActual.equals("autor")) {
                            libroActual.setAutor(texto.getData());
                        } else if (tagActual.equals("editorial")) {
                            libroActual.setEditorial(texto.getData());
                        } else if (tagActual.equals("paginas")) {
                            libroActual.setPaginas(Integer.valueOf(texto.getData()));
                        }
                    }
                }
                biblioteca.add(libroActual);
            }


        }  catch (XMLStreamException e) {
            e.printStackTrace();
        }

        System.out.println(biblioteca);

        /*int paginasMaximas = 0;
        Scanner sc = new Scanner(System.in);
        String editorialUsuario = sc.nextLine();*/


    }
}
