package mm.U8.Entregable_1;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class RecorridoDOM {

    static Document doc;

    public static void main(String[] args) {
        try {
            File archivo = new File("biblioteca.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(archivo);
            doc.getDocumentElement().normalize();

            numNodosHijos();
            mostrarXMLDom();
            mostrarContenidoEtiqueta("titulo");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void numNodosHijos() {
        Node raiz = doc.getDocumentElement();
        NodeList hijos = raiz.getChildNodes();

        System.out.println("Numero de nodos hijos: " + hijos.getLength());

        for (int i = 0; i < hijos.getLength(); i++) {
            Node nodo = hijos.item(i);

            System.out.print("Nodo " + i + ": ");

            switch (nodo.getNodeType()) {
                case Node.ELEMENT_NODE:
                    System.out.println("Etiqueta");
                    break;
                case Node.TEXT_NODE:
                    System.out.println("Texto");
                    break;
                case Node.COMMENT_NODE:
                    System.out.println("Comentario");
                    break;
                default:
                    System.out.println("Otro");
            }
        }
    }

    public static void mostrarXMLDom() {
        Element raiz = doc.getDocumentElement();
        NodeList libros = raiz.getChildNodes();

        for (int i = 0; i < libros.getLength(); i++) {
            Node nodo = libros.item(i);

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element libro = (Element) nodo;
                System.out.println("\nLibro categoria: " + libro.getAttribute("categoria"));

                NodeList datos = libro.getChildNodes();

                for (int j = 0; j < datos.getLength(); j++) {
                    Node dato = datos.item(j);

                    if (dato.getNodeType() == Node.ELEMENT_NODE) {
                        System.out.println(dato.getNodeName() + ": " + dato.getTextContent());
                    }
                }
            }
        }
    }

    public static void mostrarContenidoEtiqueta(String s) {
        NodeList lista = doc.getElementsByTagName(s);

        if (lista.getLength() == 0) {
            System.out.println("No existe ninguna etiqueta con nombre: " + s);
        } else {
            System.out.println("\nContenido de la etiqueta " + s + ":");

            for (int i = 0; i < lista.getLength(); i++) {
                System.out.println(lista.item(i).getTextContent());
            }
        }
    }
}