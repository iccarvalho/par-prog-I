package Revisao.ex008;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args){
        Filme filme1 = new Filme(101, 176, "Batman", "ação");
        Filme filme2 = new Filme(101, 140, "Star Wars - A vingança dos Sith", "ficção");

        Sessao sessao1 = new Sessao(1, 1, LocalDateTime.of(2026, 7, 20, 20, 0));

        sessao1.vincularFilme(filme1);
        sessao1.venderIngresso(1, "A1", "Inteira", 40);
        sessao1.venderIngresso(2, "A3", "Meia", 20);
        sessao1.venderIngresso(3, "A3", "Inteira", 40);

        System.out.println(sessao1);

        System.out.println();

        Sessao sessao2 = new Sessao(2, 1, LocalDateTime.of(2026, 5, 4, 20, 30));

        sessao2.vincularFilme(filme2);
        sessao2.venderIngresso(1, "A1", "Inteira", 40);
        sessao2.venderIngresso(2, "A3", "Inteira", 20);
        sessao2.venderIngresso(3, "A3", "Inteira", 40);
        sessao2.venderIngresso(4, "A4", "Inteira", 40);
        sessao2.venderIngresso(5, "A5", "Inteira", 40);

        System.out.println(sessao2);

    }
}
