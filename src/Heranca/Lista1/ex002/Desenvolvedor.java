package Heranca.Lista1.ex002;

public class Desenvolvedor {
    protected String nome, linguagem;
    protected double salarioBase;

    public Desenvolvedor() {}

    public Desenvolvedor(String nome, String linguagem, double salarioBase) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salarioBase = salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public String getLinguagem() {
        return this.linguagem;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", linguagem: " + linguagem +
                ", salarioBase: " + salarioBase;
    }

    public void codar(){
        System.out.println("Desenvolvedor planeja e escreve código-fonte");
    }

    public double calcularBonus(){
        return this.salarioBase * 0.05;
    }

}
