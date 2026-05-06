package Revisao.ex003;

public class Atleta {
    private int id;
    private String nome, posicao;

    public Atleta(){}

    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPosicao() {
        return this.posicao;
    }

    @Override
    public String toString() {
        return "Atleta { " +
                "id: " + this.id +
                ", nome: " + this.nome +
                ", posicao: " + this.posicao +
                " }";
    }
}
