package Revisao.ex005;

public class Main {
    public static void main(String[] args){
        // Processador é instanciado dentro do construtor do Computador
        Computador pc = new Computador(1, "Acer", "Intel", "Ryzen 7 5700G", 3.8);

        System.out.println(pc);

        // Acessando o Processador através do Computador
        System.out.println(pc.getProcessador().getMarca());
        System.out.println(pc.getProcessador().getModelo());
        System.out.println(pc.getProcessador().getFrequencia());
    }
}
