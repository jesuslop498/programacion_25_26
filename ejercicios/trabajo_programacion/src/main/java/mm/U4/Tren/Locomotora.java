package mm.U4.Tren;


public class Locomotora {
    private String matricula;
    private int potenciaMotor;
    private int anioFabricacion;
    private Mecanico mecanicoAsignado;

    public Locomotora(String matricula, int potenciaMotor, int anioFabricacion, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anioFabricacion = anioFabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
    }
}
