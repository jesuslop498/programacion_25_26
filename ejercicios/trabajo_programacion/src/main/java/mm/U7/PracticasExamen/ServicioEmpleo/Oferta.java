package mm.U7.PracticasExamen.ServicioEmpleo;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Oferta implements Serializable {

    private Integer codigo;
    private String descripcion;
    private boolean cubierta;
    private Set<Trabajador> trabajadores;

    public Oferta(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cubierta = false;
        this.trabajadores = new TreeSet<>();
    }

    public Integer getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public boolean isCubierta() { return cubierta; }
    public Set<Trabajador> getTrabajadores() { return trabajadores; }

    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }
}
