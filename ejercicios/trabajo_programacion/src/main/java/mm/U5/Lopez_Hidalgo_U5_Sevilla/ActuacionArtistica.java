package mm.U5.Lopez_Hidalgo_U5_Sevilla;

public class ActuacionArtistica implements ensayar, programar {
    private String nombreArtista;
    private int duracion;
    private String genero;
    private int cache;
    private int cont = 0;

    public ActuacionArtistica(int cache, String genero, int duracion, String nombreArtista) {
        this.cache = cache;
        this.genero = genero;
        this.duracion = duracion;
        this.nombreArtista = nombreArtista;
        cont++;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public int getCache() {
        return cache;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public void numActuaciones() {
        System.out.println("Actuaciones registradas: " + cont);
    }

    @Override
    public void ensayar() {
        System.out.println("Ensayando actuación de " + getNombreArtista() + " con duración " + getDuracion() +  " minutos");
    }

    @Override
    public void programar() {
        System.out.println("La actuación de " + getNombreArtista() + " se puede programar libremente");
    }
}

