package U8.Entregable2021;

//Crear una clase RecorridoDOM donde desde el método Main se llama a los siguientes métodos (que deberán ser estáticos):
//
//mostrarXML que partiendo del nodo raíz mostrará por pantalla el menú.
//cantidadDePlatos que mostrará por pantalla el número de platos de la carta.
//platoMasCaro que mostrará por pantalla el nombre y el precio del plato más caro.



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {
    public static void main(String[] args) {
        mostrarXML();
        cantidadDePlatos();
        System.out.println("------------------------------");
        platoMasCaro();
    }

    // Metodo: platoMasCaro()

    public static void platoMasCaro() {
        try {
            double precioMasCaro = 0;
            int posPrecioI = 0;
            int posPrecioJ = 0;


            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros//U8//Entregable2021//ejercicio1.xml"));

            //Cogemos el nodo raiz
            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();


            for (int i = 0; i < nl.getLength(); i++) {
                NodeList ei = nl.item(i).getChildNodes();
                for (int j = 0; j < ei.getLength(); j++) {
                    if (ei.item(j).getNodeType() == Node.ELEMENT_NODE){
                        Element ej = (Element) ei.item(j);
                        if (ej.getTagName().equals("price")){
                            if (Double.parseDouble(ej.getTextContent()) > precioMasCaro){
                                precioMasCaro = Double.parseDouble(ej.getTextContent());
                                posPrecioI = i;
                                posPrecioJ = j;

                            }
                        }
                    }

                }
            }
            System.out.println(nl.item(posPrecioI).getChildNodes().item(posPrecioJ-2).getTextContent()+":"+precioMasCaro);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    // Metodo: cantidadDePlatos()

    public static void cantidadDePlatos() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros//U8//Entregable2021//ejercicio1.xml"));

            //Cogemos el nodo raiz
            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();
            int contadorPlatos = 0;

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    contadorPlatos++;
                }
            }

            System.out.println("El menu consta de "+contadorPlatos+" platos.");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    /* Método: mostrarXML */

    public static void mostrarXML() {
        try {

            //Se carga el fichero

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros//U8//Entregable2021//ejercicio1.xml"));

            //Numero de nodos de todo el documento (siempre va a ser 1)
            //System.out.println(doc.getChildNodes().getLength());

            //Nodo raiz
            Element root = doc.getDocumentElement();

            //Numero de nodos hijos del elemento raiz (los saltos de lineas y los comentarios cuentan como nodos)
            //System.out.println(root.getChildNodes().getLength());

            //Lista de nodos
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                NodeList ei = nl.item(i).getChildNodes();
                for (int j = 0; j < ei.getLength(); j++) {
                    if (ei.item(j).getNodeType() == Node.ELEMENT_NODE){
                        Element ej = (Element) ei.item(j);
                        System.out.println(ej.getTagName()+": "+ej.getTextContent());
                    }

                }
                System.out.println("------------------------------");
            }
                //Es un hijo que es etiqueta (element)
//                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
//
//                    //Muestro la información del elemento (etiqueta)
//                    System.out.println("He encontrado un nodo etiqueta");
//                    Element e = (Element) nl.item(i);
//                    System.out.println("Es la etiqueta: "+e.getTagName());
//                    System.out.println("Y contiene:");
//                    System.out.println(e.getTextContent());
//
//                    // He encontrado un nodo texto
//                } else if (nl.item(i).getNodeType() == Node.TEXT_NODE) {
//                    System.out.println("He encontrado un nodo texto");
//                    System.out.println("Y contiene:");
//                    Text texto = (Text) nl.item(i);
//                    System.out.println(texto.getTextContent());
//                }
//                Element e = (Element) nl.item(i).getChildNodes().ge
//                System.out.println();
//                System.out.println("----------------------------------------");
//            }


        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
