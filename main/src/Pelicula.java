public class Pelicula {
    public int codigo;
    public String titulo;
    public int duracion;
    public GENERO genero;
    public String clasificacion;



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public GENERO getGenero() {
        return genero;
    }

    public void setGenero(GENERO genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", clasificacion='" + clasificacion + '\'' +
                '}';
    }

    public Pelicula(int codigo, String titulo, int duracion, GENERO genero, String clasificacion){
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;



}
}