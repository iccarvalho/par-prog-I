public class Pleno extends Desenvolvedor {
    private int projetosEntregues;

    public Pleno(){
        super();
    }

    public Pleno(String nome, String linguagem, double salarioBase, int qtdeProjetos) {
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = qtdeProjetos;
    }
}
