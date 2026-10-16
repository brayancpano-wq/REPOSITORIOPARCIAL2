public class Funcion {
    public int codigo;
    public String fecha;
    public String horaInicio;
    public double precioBase;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "codigo=" + codigo +
                ", fecha='" + fecha + '\'' +
                ", horaInicio='" + horaInicio + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }

    public Funcion(int codigo, String fecha, String horaInicio, double precioBase) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.precioBase = precioBase;


    }
}
