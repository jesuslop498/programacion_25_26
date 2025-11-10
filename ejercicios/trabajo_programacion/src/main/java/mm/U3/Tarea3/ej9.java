package mm.U3.Tarea3;

public class ej9 {
    public static void main(String[] args) {
        int [] intento = {5, 6, 78, 41, 51, 21};
        int [] primitiva = {5, 6, 78, 41, 51, 21};

        int contador = 0;

        for (int i = 0; i < intento.length; i++) {
            for (int j = 0; j < primitiva.length; j++) {
                if (intento[i] == primitiva[j]) {
                    contador++;
                }
            }
        }
        System.out.println("El numero de aciertos es: " + contador);
    }
}
