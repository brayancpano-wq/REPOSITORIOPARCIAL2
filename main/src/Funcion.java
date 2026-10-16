/**
 * Clase para una funcion
 * de el cine
 */
import java.util.ArrayList;
import java.util.List;

public class Funcion {
    public int codigo;
    public String fecha;
    public String horaInicio;
    public double precioBase;

    private ArrayList<Boleta> listCineBoleta;

    private Sala sala;

    //si un asiento específico (fila y número) está disponible para esta función

    public boolean verificarDisponibilidadAsiento(int fila, int numeroAsiento) {
        for (Boleta b : listCineBoleta) {
            if (b.getNumeroFila() == fila && b.getNumeroAsiento() == numeroAsiento) {
                return false; // El asiento ya está vendido
            }
        }
        return true; // Asiento disponible
    }

    /**
     * Registra una boleta vendida para esta función
     * @param boleta Boleta a registrar
     * @return true si se agregó con éxito, false si el asiento estaba ocupado
     */
    public boolean registrarBoletaVendida(Boleta boleta) {
        if (verificarDisponibilidadAsiento(boleta.getNumeroFila(), boleta.getNumeroAsiento())) {
            return listCineBoleta.add(boleta);
        }
        return false;
    }

    // Calcula el porcentaje de ocupación de la función según la capacidad máxima de la sala

    public double calcularPorcentajeOcupacion() {
        if (sala != null && sala.getCapacidadMaxima() > 0) {
            return ((double) listCineBoleta.size() / sala.getCapacidadMaxima()) * 100.0;
        }
        return 0.0;
    }

    public double calcularIngresos() {
        return this.precioBase * this.listCineBoleta.size();
    }

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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "codigo=" + codigo +
                ", fecha='" + fecha + '\'' +
                ", horaInicio='" + horaInicio + '\'' +
                ", precioBase=" + precioBase +
                ", sala=" + sala +
                '}';
    }
    /**
     * Metodo constructor de la clase funcion
     * @param codigo de la funcion
     * @param fecha de la funcion
     * @param horaInicio de la funcion
     * @param precioBase de la funcion
     */
    public Funcion(int codigo, String fecha, String horaInicio, double precioBase) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.precioBase = precioBase;
        this.sala = sala;

    }
}
