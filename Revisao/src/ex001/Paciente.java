package ex001;

public class Paciente {
    private String nome, CPF;
    private int id;

    public Paciente() {}

    public Paciente(String nome, String CPF, int id) {
        this.nome = nome;
        this.CPF = CPF;
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return " { " +
                "nome: " + this.nome +
                ", CPF: " + this.CPF +
                ", id: " + this.id +
                " }";
    }
}
