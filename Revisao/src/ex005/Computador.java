package ex005;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(){}

    public Computador(int id, String marca, String marcaCPU, String modeloCPU, double frequenciaCPU) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaCPU, modeloCPU, frequenciaCPU);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcessador(String marca, String modelo, double frequencia) {
        this.processador = new Processador(marca, modelo, frequencia);
    }

    public int getId() {
        return this.id;
    }

    public String getMarca() {
        return this.marca;
    }

    public Processador getProcessador() {
        return this.processador;
    }

    @Override
    public String toString() {
        return "Computador {" +
                "id: " + this.id +
                ", marca: " + this.marca +
                ", processador: " + this.processador +
                " }";
    }
}
