package Revisao.ex006;

public class Apartamento {
    private int numero, andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAndar() {
        return this.andar;
    }

    @Override
    public String toString() {
        return "Apartamento { " +
                "numero: " + this.numero +
                ", andar: " + this.andar +
                " }";
    }
}
