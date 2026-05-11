package mm.U8.Entregable_1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class RecorridoSax {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean titulo = false;
                boolean autor = false;
                boolean anio = false;

                public void startElement(String uri, String localName, String qName, Attributes attributes)
                        throws SAXException {

                    System.out.println("Inicio etiqueta: " + qName);

                    if (qName.equalsIgnoreCase("titulo")) titulo = true;
                    if (qName.equalsIgnoreCase("autor")) autor = true;
                    if (qName.equalsIgnoreCase("anio")) anio = true;

                    if (attributes.getLength() > 0) {
                        for (int i = 0; i < attributes.getLength(); i++) {
                            System.out.println("Atributo -> " + attributes.getQName(i) + ": " + attributes.getValue(i));
                        }
                    }
                }

                public void characters(char ch[], int start, int length) throws SAXException {
                    String contenido = new String(ch, start, length).trim();

                    if (!contenido.isEmpty()) {
                        if (titulo) {
                            System.out.println("Titulo: " + contenido);
                            titulo = false;
                        } else if (autor) {
                            System.out.println("Autor: " + contenido);
                            autor = false;
                        } else if (anio) {
                            System.out.println("Año: " + contenido);
                            anio = false;
                        }
                    }
                }

                public void endElement(String uri, String localName, String qName) throws SAXException {
                    System.out.println("Fin etiqueta: " + qName);
                }
            };

            saxParser.parse("C:\\Users\\1DAM-jlophid2005\\repos\\ejercicios\\trabajo_programacion\\src\\main\\java\\mm\\U8\\Entregable_1", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}