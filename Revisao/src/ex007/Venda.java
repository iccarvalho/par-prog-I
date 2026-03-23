package ex007;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itensVenda;

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itensVenda = new ArrayList<>();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItemVenda(int id, int quantidade, Produto produto){
        this.itensVenda.add(new ItemVenda(id, quantidade, produto));
        System.out.println(this.itensVenda.getLast().getQuantidade() + " " + this.itensVenda.getLast().getProduto().getNome() + " adicionado a venda!");
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return this.itensVenda;
    }

    @Override
    public String toString() {
        return "Venda { " +
                "cliente: " + this.cliente +
                ", itensVenda: " + this.itensVenda +
                '}';
    }

    public double calcularTotal(){
        double total = 0;

        for(ItemVenda item : this.itensVenda){
            total += item.getQuantidade() * item.getProduto().getPreco();
        }

        return total;
    }
}
