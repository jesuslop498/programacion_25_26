//package mm.U5.Transportes;
//
//public class Caja {
//    private final double ancho;
//    private final double alto;
//    private final double fondo;
//    private final Unidades unidad;
//
//    // Constructor
//    public Caja(double ancho, double alto, double fondo, Unidades u) {
//        if (u == Unidades.CM) {
//            // Convertir dimensiones a metros
//            this.ancho = ancho / 100;
//            this.alto = alto / 100;
//            this.fondo = fondo / 100;
//        } else {
//            this.ancho = ancho;
//            this.alto = alto;
//            this.fondo = fondo;
//        }
//        this.unidad = Unidades.M; // Siempre se almacena en metros
//    }
//
//    // Metodo para obtener el volumen en metros cúbicos
//    public double getVolumen() {
//        return ancho * alto * fondo;
//    }
//
//    // Metodo toString para representar la caja
//    @Override
//    public String toString() {
//        return String.format("Caja [Ancho=%.2f m, Alto=%.2f m, Fondo=%.2f m, Volumen=%.4f m³]",
//                ancho, alto, fondo, getVolumen());
//    }
//}