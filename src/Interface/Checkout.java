package Interface;

public class Checkout {
    public static void main(String[] args) {
        Pagamento pagamento;

        pagamento = new CartaoCredito();
        pagamento.autorizar(700); // polimorfismo
        pagamento.exibirComprovante(); // polimorfismo

        pagamento = new Pix();
        pagamento.autorizar(800); // polimorfismo
        pagamento.exibirComprovante(); // polimorfismo

    }
}
