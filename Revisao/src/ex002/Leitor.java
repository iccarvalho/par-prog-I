package ex002;

public class Leitor {
    private int id;
    private String nome;

    public Leitor() {}

    public Leitor(int id, String nome) {
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
        return " { " +
                "id: " + this.id +
                ", nome: " + this.nome +
                " }";
    }
}
