public class ItemPedido {
    private int ID;
    private double qtde;
    private Produto produto;

    public ItemPedido() {}

    public ItemPedido(int ID, double qtde, Produto produto) {
        setID(ID);
        setQtde(qtde);
        setProduto(produto);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getID() {
        return ID;
    }

    public double getQtde() {
        return qtde;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "\n  {" +
                "\n   ID: " + this.ID +
                "\n   qtde: " + this.qtde +
                "\n   produto: " + this.produto +
                "\n  }";
    }
}
