package ex006;

import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return this.apartamentos;
    }

    @Override
    public String toString() {
        return "Edificio { " +
                "nome: " + this.nome +
                ", endereco: " + this.endereco +
                ", apartamentos: " + this.apartamentos +
                " }";
    }

    public void construirApartamento(int numero, int andar){
        this.apartamentos.add(new Apartamento(numero, andar));
        System.out.println("Apartamento " + this.apartamentos.getLast().getNumero() + " foi construído no " + this.apartamentos.getLast().getAndar() + "º andar!");
    }
}
