package Lista1.ex002;

public class Pleno extends Desenvolvedor {
    private int projetosEntregues;

    public Pleno(){
        super();
    }

    public Pleno(String nome, String linguagem, double salarioBase, int qtdeProjetos) {
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = qtdeProjetos;
    }

    public int getProjetosEntregues() {
        return this.projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }

    @Override
    public String toString() {
        return "Pleno { " +
                super.toString() +
                ", projetosEntregues: " + this.projetosEntregues +
                " }";
    }

    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo código e fazendo Code Review");
    }

    @Override
    public double calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.15;
    }
}
