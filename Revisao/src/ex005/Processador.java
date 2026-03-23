package ex005;

public class Processador {
    private String marca, modelo;
    private double frequencia;

    public Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getFrequencia() {
        return this.frequencia;
    }

    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " " + this.frequencia + "GHz";
    }
}
