package mm.U7.U7_Examen;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GestorMilitar g = new GestorMilitar();

        Aeronave a1 = new Aeronave("F22", "Toyota", TipoAeronave.CAZA, 1500);
        Aeronave a2 = new Aeronave("F16", "Toyota", TipoAeronave.CAZA, 1500);
        Aeronave a3 = new Aeronave("B2", "Toyota", TipoAeronave.BOMBARDERO, 1500);
        Aeronave a4 = new Aeronave("F14", "Toyota", TipoAeronave.CAZA, 1500);
        Aeronave a5 = new Aeronave("Bombardero", "Toyota", TipoAeronave.BOMBARDERO, 1500);

        Armamento arm1 = new Armamento("50", "Bala larga", 500, 1020);
        Armamento arm2 = new Armamento("60", "Bala larga", 500, 1020);
        Armamento arm3 = new Armamento("70", "Bala larga", 500, 1020);
        Armamento arm4 = new Armamento("80", "Bala larga", 500, 1020);
        Armamento arm5 = new Armamento("90", "Bala larga", 500, 1020);

        g.addEquipamiento(a1, arm1);
        g.addEquipamiento(a2, arm2);
        g.addEquipamiento(a3, arm3);
        g.addEquipamiento(a4, arm4);
        g.addEquipamiento(a5, arm5);

        System.out.println("Armamento equipado en la primera aeronave: ");
        List<Armamento> arma1 = g.getArmamento(a1);
        System.out.println(arma1);

        System.out.println("Armamento equipado en la segunda aeronave: ");
        List<Armamento> arma2 = g.getArmamento(a2);
        System.out.println(arma2);

        System.out.println(g.getAeronaves(arm1));
        System.out.println("Datos guardados correctamente");
        g.guardarDatos();

        g.cargarDatos();

    }
}
