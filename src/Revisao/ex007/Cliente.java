package Revisao.ex007;

public class Cliente {
    private int id;
    private String nome;

    public Cliente() {}

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "{ " +
                "id: " + this.id +
                ", nome: " + this.nome +
                " }";
    }
}
