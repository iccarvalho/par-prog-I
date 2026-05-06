package Revisao.ex007;

public class ItemVenda {
    private int id, quantidade;
    private Produto produto;

    public ItemVenda() {}

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getId() {
        return this.id;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    @Override
    public String toString() {
        return "{ " +
                "id: " + this.id +
                ", quantidade: " + this.quantidade +
                ", produto: " + this.produto +
                " }";
    }
}
