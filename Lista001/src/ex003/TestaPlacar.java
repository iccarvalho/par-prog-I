package ex003;

public class TestaPlacar {
    public static void main(String[] args){
        Placar jogo = new Placar("Time A", "Time B");

        jogo.registrarPonto("casa", 1);
        jogo.registrarPonto("visitante", 2);

        jogo.proximoQuarto();

        jogo.registrarPonto("visitante", 2);

        jogo.proximoQuarto();

        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 1);

        jogo.proximoQuarto();

        jogo.registrarPonto("casa", 3);

        jogo.proximoQuarto();

        System.out.println(jogo.toString());
    }
}
