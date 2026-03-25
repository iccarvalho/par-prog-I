public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior(){
        super();
    }

    public Junior(String nome, String linguagem, double salarioBase, String mentor) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }
}
