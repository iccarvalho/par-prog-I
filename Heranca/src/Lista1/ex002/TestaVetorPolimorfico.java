package Lista1.ex002;

public class TestaVetorPolimorfico {
    static void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Fulano", "Java", 4000, "Beltrano");
        devs[1] = new Pleno("Beltrano", "Java", 6000, 5);
        devs[2] = new Senior("Ciclano", "Java", 8000, 2000);
        devs[3] = new Desenvolvedor("Daniel", "Java", 20000);

        for(Desenvolvedor dev : devs) {
            dev.codar();
            System.out.println("Bônus: R$ " + dev.calcularBonus());
            System.out.println(dev + "\n");
        }
    }
}
