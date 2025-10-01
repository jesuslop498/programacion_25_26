package mm.U1.Tarea7;

public class ej3 {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 26);

        char letra = (char) (random + 97);

        System.out.println("Letra minuscula aleatoria: " + letra);

    }
}
