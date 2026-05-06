package Revisao.ex001;

public class Medico {
    private String nome, especialidade;
    private int id;

    public Medico() {}

    public Medico(String nome, String especialidade, int id) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return " { " +
                "nome: " + this.nome +
                ", especialidade: " + this.especialidade +
                ", id: " + this.id +
                " }";
    }
}
