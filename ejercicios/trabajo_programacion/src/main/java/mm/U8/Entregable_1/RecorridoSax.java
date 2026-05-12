package mm.U8.Entregable_1;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class RecorridoSax {

    public static void main(String[] args) {

        try {

            File archivo = new File("personasXML.xml");

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler manejador = new DefaultHandler() {

                boolean bNombre = false;
                boolean bApellido = false;
                boolean bDepartamento = false;

                public void startElement(String uri, String localName,
                                         String qName, Attributes attributes) {

                    System.out.println("Inicio etiqueta: " + qName);

                    if (qName.equalsIgnoreCase("nombre")) {
                        bNombre = true;
                    }

                    if (qName.equalsIgnoreCase("apellido")) {
                        bApellido = true;
                    }

                    if (qName.equalsIgnoreCase("departamento")) {
                        bDepartamento = true;
                    }
                }

                public void characters(char ch[], int start, int length) {

                    if (bNombre) {
                        System.out.println("Nombre: " + new String(ch, start, length));
                        bNombre = false;
                    }

                    if (bApellido) {
                        System.out.println("Apellido: " + new String(ch, start, length));
                        bApellido = false;
                    }

                    if (bDepartamento) {
                        System.out.println("Departamento: " + new String(ch, start, length));
                        bDepartamento = false;
                    }
                }

                public void endElement(String uri, String localName,
                                       String qName) {

                    System.out.println("Fin etiqueta: " + qName);
                }
            };

            saxParser.parse(archivo, manejador);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}