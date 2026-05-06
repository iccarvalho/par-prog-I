package Interface.ex001;

public class TestaSmartHouse {
    public static void main(String[] args) {
        FechaduraEletronica porta = new FechaduraEletronica("1234");
        porta.validarAcesso("1234");

        TermostatoSmart termostato = new TermostatoSmart();
        termostato.ligar();
        System.out.println("Temperatura atual: " + termostato.lerTemperatura());
    }
}
