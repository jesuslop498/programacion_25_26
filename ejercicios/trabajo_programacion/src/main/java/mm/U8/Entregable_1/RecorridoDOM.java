package mm.U8.Entregable_1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

//RECORRIDO DOM
public class RecorridoDOM {

    static Document doc;

    public static void main(String[] args) {

        try {

            File archivo = new File("C:\\Users\\Jesus Lopez\\IdeaProjects\\programacion_25_26\\ejercicios\\trabajo_programacion\\src\\main\\java\\mm\\U8\\Entregable_1\\personasXML.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            doc = builder.parse(archivo);
            doc.getDocumentElement().normalize();

            numNodosHijos();

            System.out.println("-------------------");

            mostrarXMLDom();

            System.out.println("-------------------");

            mostrarContenidoEtiqueta("nombre");

            System.out.println("-------------------");

            mostrarContenidoEtiqueta("telefono");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void numNodosHijos() {

        Element raiz = doc.getDocumentElement();
        NodeList lista = raiz.getChildNodes();

        System.out.println("Número de nodos hijos: " + lista.getLength());

        for (int i = 0; i < lista.getLength(); i++) {

            Node nodo = lista.item(i);

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
                    System.out.println("Otro tipo");
                    break;
            }
        }
    }

    public static void mostrarXMLDom() {

        Element raiz = doc.getDocumentElement();
        NodeList empleados = raiz.getChildNodes();

        for (int i = 0; i < empleados.getLength(); i++) {

            Node nodo = empleados.item(i);

            if (nodo.getNodeType() == Node.ELEMENT_NODE) {

                Element empleado = (Element) nodo;

                System.out.println("Empleado ID: " + empleado.getAttribute("id"));

                NodeList datos = empleado.getChildNodes();

                for (int j = 0; j < datos.getLength(); j++) {

                    Node dato = datos.item(j);

                    if (dato.getNodeType() == Node.ELEMENT_NODE) {

                        System.out.println(
                                dato.getNodeName() + ": " + dato.getTextContent()
                        );
                    }
                }

                System.out.println();
            }
        }
    }

    public static void mostrarContenidoEtiqueta(String s) {

        NodeList lista = doc.getElementsByTagName(s);

        if (lista.getLength() == 0) {

            System.out.println("No existe ninguna etiqueta llamada: " + s);
            return;
        }

        for (int i = 0; i < lista.getLength(); i++) {

            Node nodo = lista.item(i);

            System.out.println(
                    "Contenido de <" + s + ">: " + nodo.getTextContent()
            );
        }
    }
}
