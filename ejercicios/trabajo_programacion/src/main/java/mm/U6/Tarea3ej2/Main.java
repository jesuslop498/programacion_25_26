package mm.U6.Tarea3ej2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    static String nombreLog;

    public static void escribirLog(String codigo, Exception e) {

        try {

            FileWriter fw = new FileWriter(nombreLog, true);

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String fecha = LocalDateTime.now().format(formato);

            fw.write(fecha + " - " + codigo + " - " +
                    e.getClass().getSimpleName() + ": " +
                    e.getMessage() + "\n");

            fw.close();

        } catch (IOException ex) {
            System.out.println("Error escribiendo en el log");
        }

    }

    public static void main(String[] args) {

        DateTimeFormatter formatoArchivo = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        nombreLog = "errores_" + LocalDateTime.now().format(formatoArchivo) + ".log";

        try {
            Cliente c1 = new Cliente("33333333N", -33);
        } catch (EdadErroneaException e) {

            escribirLog("EX001", e);

        } catch (MenorDeEdadException e) {

            escribirLog("EX002", e);

        }

        try {
            Cliente c2 = new Cliente("44444444P", 16);
        } catch (EdadErroneaException e) {

            escribirLog("EX001", e);

        } catch (MenorDeEdadException e) {

            escribirLog("EX002", e);

        }

        try {
            Cliente c3 = new Cliente("55555555A", 25);
            System.out.println("Cliente creado correctamente");

        } catch (EdadErroneaException e) {

            escribirLog("EX001", e);

        } catch (MenorDeEdadException e) {

            escribirLog("EX002", e);

        }

    }
}

