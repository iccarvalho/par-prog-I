package Lista1.ex001;

public class Veiculo {
    protected String marca, modelo;
    protected double velocidade;

    public Veiculo() {}

    public Veiculo(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    @Override
    public String toString() {
        return "marca: " + this.marca +
                ", modelo: " + this.modelo +
                ", velocidade: " + this.velocidade + " km/h";
    }

    public void mover() {
        System.out.println("Veículo se movendo...");
    }

    public void abastecer() {
        System.out.println("Veículo reabastecendo...");
    }
}
