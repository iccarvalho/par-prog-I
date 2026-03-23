package ex008;

public class Ingresso {
    private int id;
    private String assento, tipo;
    private double preco;

    public Ingresso() {}

    public Ingresso(int id, String assento, String tipo, double preco) {
        this.id = id;
        this.assento = assento;
        this.setTipo(tipo);
        this.preco = preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public void setTipo(String tipo) {
        if(tipo.equalsIgnoreCase("Inteira") || tipo.equalsIgnoreCase("Meia")){
            this.tipo = tipo;
        } else{
            System.out.println("Tipo de ingresso inválido! Escolha entre 'Inteira' ou 'Meia'.");
        }
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return this.id;
    }

    public String getAssento() {
        return this.assento;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "{ " +
                "id: " + this.id +
                ", assento: " + this.assento +
                ", tipo: " + this.tipo +
                ", preco: " + this.preco +
                " }";
    }
}
