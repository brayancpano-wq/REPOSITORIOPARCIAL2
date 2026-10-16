public class Sala {
    public int codigo;
    public String nombre;
    public int capacidadMaxima;
    public TIPOSALA tiposala;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public TIPOSALA getTiposala() {
        return tiposala;
    }

    public void setTiposala(TIPOSALA tiposala) {
        this.tiposala = tiposala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", tiposala=" + tiposala +
                '}';
    }

    public Sala(int codigo, String nombre, int capacidadMaxima, TIPOSALA tiposala) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.tiposala = tiposala;

    }
}
