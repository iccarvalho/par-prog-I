package TodoParte;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int ID;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<ItemPedido> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList<>(); // aloca espaço na memória
    }

    // O cliente veio pronto, mostrando sua independencia do Pedido
    public Pedido(int ID, Date data, Cliente cliente) {
        setID(ID);
        setData(data);
        setCliente(cliente);
        this.itensPedido = new ArrayList<>(); // aloca espaço na memória
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getID() {
        return this.ID;
    }

    public Date getData() {
        return this.data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public String toString() {
        return "Pedido {" +
                "\n ID:" + this.ID +
                "\n data: " + this.data +
                "\n " + this.cliente +
                "\n itens do pedido: " + this.itensPedido +
                "\n }";
    }

    // Método que adiciona um item de pedido no array
    public void adicionarItemPedido(int ID, double qtde, Produto produto){
        ItemPedido item = new ItemPedido(ID, qtde, produto);
        this.itensPedido.add(item);
        System.out.println("Item do pedido adicionado com sucesso!");
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item : this.itensPedido){
            total += item.getProduto().getPreco() * item.getQtde();
        }
        return total;
    }
}
