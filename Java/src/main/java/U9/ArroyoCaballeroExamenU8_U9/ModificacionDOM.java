package U9.ArroyoCaballeroExamenU8_U9;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.lang.String;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificacionDOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del libro: ");
        String nombreLibro = sc.nextLine();
        System.out.println("Introduzca el autor del libro: ");
        String nombreAutor = sc.nextLine();
        System.out.println("Introduzca la editorial del libro: ");
        String nombreEditorial = sc.nextLine();
        System.out.println("Introduzca las paginas del libro: ");
        String numeroPaginas = sc.nextLine();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros//ejercicio1.xml"));

            Node root = doc.getDocumentElement();

            Element libro = doc.createElement("libro");

            Element titulo = doc.createElement("titulo");
            titulo.setTextContent(nombreLibro);

            Element autor = doc.createElement("autor");
            autor.setTextContent(nombreAutor);

            Element editorial = doc.createElement("editorial");
            editorial.setTextContent(nombreEditorial);

            Element paginas = doc.createElement("paginas");
            paginas.setTextContent(numeroPaginas);

            libro.appendChild(titulo);
            libro.appendChild(autor);
            libro.appendChild(editorial);
            libro.appendChild(paginas);

            root.appendChild(libro);

            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                NodeList nlibro = nl.item(i).getChildNodes();
                for (int j = 0; j < nlibro.getLength(); j++) {
                    if (nlibro.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element editorialParaTag = (Element) nl.item(i).getChildNodes().item(j);
                        if (editorialParaTag.getTagName().equals("editorial")){
                            Element country = doc.createElement("Pais");
                            country.setTextContent("Alemania");
                            nl.item(i).getChildNodes().item(j).appendChild(country);

                        }
                    }
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

            File nuevaBiblioteca = new File("Ficheros//ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevaBiblioteca);

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
