package mm.U4.Entregables.ObraVivienda;

import java.util.Scanner;

public class Material {
    private String descripcion;
    private String proveedor;
    private int unidades;
    private int precioPorUnidad;
    private static int iva = 21;

    public Material(String descripcion, String proveedor, int unidades, int precioPorUnidad) {
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        setUnidades(unidades);
        setPrecioPorUnidad(precioPorUnidad);
    }

    public Material(String descripcion, int unidades, int precioPorUnidad) {
        this.descripcion = descripcion;
        this.proveedor = "Desconocido";
        setUnidades(unidades);
        setPrecioPorUnidad(precioPorUnidad);
    }

    private void setUnidades(int unidades) {
        if (unidades >= 1 && unidades <= 1000) {
            this.unidades = unidades;
        } else {
            this.unidades = 0;
        }
    }

    private void setPrecioPorUnidad(int precio) {
        if (precio >= 0 && precio <= 100000) {
            this.precioPorUnidad = precio;
        } else {
            this.precioPorUnidad = 0;
        }
    }

    public static int getIva() {
        return iva;
    }

    public static void setIva(int nuevoIva) {
        iva = nuevoIva;
    }

    @Override
    public String toString() {
        return "Material{" +
                "descripcion='" + descripcion + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", unidades=" + unidades +
                ", precioPorUnidad=" + precioPorUnidad +
                '}';
    }
}
