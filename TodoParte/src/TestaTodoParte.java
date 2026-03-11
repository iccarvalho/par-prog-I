import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){
        // cria um objeto da classe Cliente independente
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "Fulano", "123-456-789-0", "Rua Chile");

        // cria o objeto todo
        Pedido p1 = new Pedido(1, new Date(), cl2);

        System.out.println(p1);
    }
}
