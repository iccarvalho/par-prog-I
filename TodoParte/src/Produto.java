public class Produto {
    private int ID;
    private String nome, descricao;
    private double preco;

    public Produto() {}

    public Produto(int ID, String nome, String descricao, double preco) {
        setID(ID);
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "{" +
                "\n    ID: " + this.ID +
                "\n    nome: " + this.nome +
                "\n    descricao: " + this.descricao +
                "\n    preco: " + this.preco +
                "\n   }";
    }
}
