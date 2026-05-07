package dc.unifacef.memoria.model;

public class Produto {
    private Long ID;
    private String nome;
    private Double preco;
    private Integer qtde;

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Long getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQtde() {
        return qtde;
    }
}
