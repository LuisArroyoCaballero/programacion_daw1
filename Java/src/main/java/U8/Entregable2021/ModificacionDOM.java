package U8.Entregable2021;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class ModificacionDOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del plato: ");
        String nombrePlato = sc.nextLine();
        System.out.println("Introduzca la descripcion del plato: ");
        String descripcionPlato = sc.nextLine();
        System.out.println("Introduzca el precio del plato: ");
        Double precioPlato = sc.nextDouble();
        System.out.println("Introduzca las calorias del plato: ");
        Double caloriasPlato = sc.nextDouble();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros//U8//Entregable2021//ejercicio1.xml"));

            Node root = doc.getDocumentElement();

            Element plato = doc.createElement("food");

            Element nombre = doc.createElement("name");
            nombre.setTextContent(nombrePlato);

            Element precio = doc.createElement("price");
            precio.setTextContent(precioPlato.toString());

            Element calorias = doc.createElement("calories");
            calorias.setTextContent(caloriasPlato.toString());

            Element descripcion = doc.createElement("description");
            descripcion.setTextContent(descripcionPlato);

            plato.appendChild(nombre);
            plato.appendChild(precio);
            plato.appendChild(descripcion);
            plato.appendChild(calorias);

            root.appendChild(plato);

            NodeList nl = root.getChildNodes();


            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    Element healthy = doc.createElement("healthy");
                    healthy.setTextContent("true");
                    nl.item(i).appendChild(healthy);
                }
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevasComidas = new File("Ficheros//U8//Entregable2021//ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevasComidas);

            transformer.transform(origenDOM,destino);






        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
