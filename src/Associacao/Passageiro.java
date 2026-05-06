package Associacao;

public class Passageiro {
    private String CPF, nome;

    public Passageiro() {}

    public Passageiro(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Passageiro { " +
                "CPF: " + CPF +
                ", nome: " + nome +
                " }";
    }
}
