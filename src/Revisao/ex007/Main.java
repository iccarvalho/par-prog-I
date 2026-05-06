package Revisao.ex007;

public class Main {
    public static void main(String[] args){
        Produto pr1 = new Produto(101, "Arroz 5kg", 30.99);
        Produto pr2 = new Produto(102, "Feijão 1kg", 15.35);
        Produto pr3 = new Produto(103, "Acúcar 1kg", 10.90);

        Cliente cliente = new Cliente(354, "Igor");

        Venda venda = new Venda(cliente);
        venda.addItemVenda(1, 1, pr1);
        venda.addItemVenda(2, 2, pr2);
        venda.addItemVenda(3, 3, pr3);

        System.out.println(venda);
        System.out.println("Total da venda: R$" + venda.calcularTotal());
    }
}
