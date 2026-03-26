import java.util.ArrayList;

public class TestaDev {
    public static void main(String[] args){
        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        exibir(jr1);

        System.out.println();

        Pleno pl1 = new Pleno("Beltrano", "Java", 6000, 5);
        exibir(pl1);

        System.out.println();

        Senior sr1 = new Senior("Ciclano", "Java", 8000, 2000);
        exibir(sr1);

        System.out.println();

        ArrayList<Desenvolvedor> empresa = new ArrayList<>();
        empresa.add(jr1);
        empresa.add(pl1);
        empresa.add(sr1);
        System.out.println(empresa);
    }

    public static void exibir(Desenvolvedor dev){
        System.out.println(dev + "\nBônus: R$" + dev.calcularBonus());
        dev.codar();
    }
}
