public class Senior extends Desenvolvedor{
    private double verbaLider;

    public Senior() {
        super();
    }

    public Senior(String nome, String linguagem, double salarioBase, double verbaLideranca) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLideranca;
    }
}
