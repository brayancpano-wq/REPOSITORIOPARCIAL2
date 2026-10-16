public class operario extends Persona{
    public int codigoEmpleado;
    public String fechaContratacion;
    public double salarioBasico;

    public operario(int documento, String nombre, String correo, String telefono, int codigoEmpleado, String fechaContratacion, double salarioBasico) {
        super(documento, nombre, correo, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salarioBasico = salarioBasico;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    @Override
    public String toString() {
        return "operario{" +
                "codigoEmpleado=" + codigoEmpleado +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                ", salarioBasico=" + salarioBasico +
                '}';
    }
}
