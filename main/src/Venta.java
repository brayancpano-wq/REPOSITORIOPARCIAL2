/**
 * Clase para registrar las ventas
 * de un cine
 */

import java.util.ArrayList;
import java.util.List;

public class Venta {
    public int codigo;
    public String fechaRealizacion;
    public double valorTotal;

    private ArrayList<Boleta> listCineBoleta;

    /**
     * Metodo constructor de la clase venta
     * @param codigo de la venta
     * @param fechaRealizacion de la venta
     * @param valorTotal de la venta
     */


    /**
     * Agrega una boleta a la venta y actualiza el valor total
     * @param boleta Objeto boleta a registrar
     */
    public void agregarBoleta(Boleta boleta) {
        if (boleta != null) {
            this.listCineBoleta.add(boleta);
            this.valorTotal += boleta.getValorIndividual();
        }
    }

    /**
     * Calcula el valor total acumulado de todas las boletas compradas
     * @return suma de los valores individuales
     */
    public double calcularValorTotal() {
        double total = 0.0;
        for (Boleta b : listCineBoleta) {
            total += b.getValorIndividual();
        }
        this.valorTotal = total;
        return total;
    }

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

