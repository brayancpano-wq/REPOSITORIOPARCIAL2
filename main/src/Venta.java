/**
 * Clase para registrar las ventas
 * de un cine
 */

public class Venta {
    public int codigo;
    public String fechaRealizacion;
    public double valorTotal;

    /**
     * Metodo constructor de la clase venta
     * @param codigo de la venta
     * @param fechaRealizacion de la venta
     * @param valorTotal de la venta
     */


    public Venta ( int codigo, String fechaRealizacion, double valorTotal){

    this.codigo=codigo;
    this.fechaRealizacion= fechaRealizacion;
    this.valorTotal=valorTotal;
 }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "codigo=" + codigo +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}

