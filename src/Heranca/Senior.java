package Heranca;

public class Senior extends Desenvolvedor{
    private double verbaLider;

    public Senior() {
        super();
    }

    public Senior(String nome, String linguagem, double salarioBase, double verbaLider) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    public void setVerbaLider(double verbaLider) {
        this.verbaLider = verbaLider;
    }

    public double getVerbaLider() {
        return verbaLider;
    }

    @Override
    public String toString() {
        return "Senior { " +
                super.toString() +
                ", verbaLider=" + verbaLider +
                " }";
    }

    @Override
    public void codar(){
        System.out.println("Senior definindo a arquitetura do software e lidendo pessoas");
    }

    @Override
    public double calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.3;
    }
}
