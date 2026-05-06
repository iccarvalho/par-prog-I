package Heranca;

public class Junior extends Desenvolvedor {
    private String mentor;

    public Junior(){
        super();
    }

    public Junior(String nome, String linguagem, double salarioBase, String mentor) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getMentor() {
        return this.mentor;
    }

    @Override
    public void codar(){
        System.out.println("Junior desenvolvendo código com mentoria de " + this.mentor);
    }

    @Override
    public String toString() {
        return "Junior { " +
                super.toString() +
                ", mentor " + this.mentor +
                " }";
    }
}
