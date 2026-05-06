package Revisao.ex002;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        Leitor leitor = new Leitor(123, "Igor");
        Livro livro = new Livro(1, "O Príncipe", "Nicolau Maquiavel");

        Emprestimo emprestimo = new Emprestimo(LocalDateTime.now(), LocalDateTime.now().plusMonths(1), leitor, livro);

        System.out.println(emprestimo);
    }
}
