package Heranca.Lista1.ex001;

public class TestaVeiculo {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("Embraer", "E-190-E2", 870, 12500);
        exibirVeiculo(aviao1);

        System.out.println();

        CarroEletrico carroEletrico1 = new CarroEletrico("Tesla", "Cybertruck", 120, 500);
        exibirVeiculo(carroEletrico1);

        System.out.println();

        Veiculo aviao2 = new Aviao("Embraer", "E-195-E2", 876, 12500);
        aviao2.mover();

        Veiculo carroEletrico2 = new CarroEletrico("Tesla", "Model S", 150, 400);
        carroEletrico2.mover();
    }

    public static void exibirVeiculo(Veiculo veiculo) {
        System.out.println(veiculo);
        veiculo.abastecer();
        veiculo.mover();
    }
}
