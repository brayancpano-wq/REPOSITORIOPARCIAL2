public class Boleta  {
    public int codigo;
    public int numeroAsiento;
    public int numeroFila;
    public double valorIndividual;

    public Boleta ( int codigo,int numeroAsiento, int numeroFila, double valorIndividual){
        this.codigo=codigo;
        this.numeroAsiento=numeroAsiento;
        this.valorIndividual=valorIndividual;
        this.numeroFila=numeroFila;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public double getValorIndividual() {
        return valorIndividual;
    }

    public void setValorIndividual(double valorIndividual) {
        this.valorIndividual = valorIndividual;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "codigo=" + codigo +
                ", numeroAsiento=" + numeroAsiento +
                ", numeroFila=" + numeroFila +
                ", valorIndividual=" + valorIndividual +
                '}';
    }
}

