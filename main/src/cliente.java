public class cliente extends Persona {
    public int codigoAfiliacion;
    public double porcentajeDescuento;

    public cliente(int documento, String nombre, String correo, String telefono, int codigoAfiliacion, double porcentajeDescuento) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(int codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "codigoAfiliacion=" + codigoAfiliacion +
                ", porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
