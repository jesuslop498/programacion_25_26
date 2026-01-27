package mm.U4.Entregables.ObraVivienda;

public class ManoDeObra {
    private String nombreEmpresa;
    private String descripcionTrabajo;
    private int horas;
    private int obreros;

    public ManoDeObra(String nombreEmpresa, String descripcionTrabajo, int horas, int obreros) {
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionTrabajo = descripcionTrabajo;
        this.horas = horas;
        this.obreros = obreros;
    }

    @Override
    public String toString() {
        return "ManoDeObra{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", descripcionTrabajo='" + descripcionTrabajo + '\'' +
                ", horas=" + horas +
                ", obreros=" + obreros +
                '}';
    }
}
