package TodoParte;

import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){
        // cria um objeto da classe Cliente independente
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "123-456-789-0", "Rua Chile");

        Produto pr1 = new Produto(100, "Mouse", "Mouse Óptico", 100);
        Produto pr2 = new Produto(200, "Monitor", "Widescreen", 900);
        Produto pr3 = new Produto(200, "Cooler", "Air Cooler", 300);

        // cria o objeto todo
        Pedido p1 = new Pedido(1, new Date(), cl2);
        p1.adicionarItemPedido(123, 2, pr1);
        p1.adicionarItemPedido(456, 3, pr2);
        p1.adicionarItemPedido(789, 1, pr3);

        System.out.println(p1);
        System.out.println("Total da compra: R$" + p1.calcularTotal());
    }
}
