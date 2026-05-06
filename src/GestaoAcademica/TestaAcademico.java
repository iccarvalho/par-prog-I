package GestaoAcademica;

public class TestaAcademico {
    public static void main(String[] args){
        Aluno al1 = new Aluno(1, "João", 12345, "Ciência da Computação");
        Aluno al2 = new Aluno(2, "Maria", 56789, "Ciência da Computação");

        Disciplina POO = new Disciplina(1, "Programação Orientada a Objetos", "Daniel F. Pires");

        POO.matricularAluno(al1);
        POO.matricularAluno(al2);

        POO.criarAvaliacao(1, "Avaliação Semestral");

        Avaliacao  av = POO.getAvaliacao("Avaliação Semestral");

        if (av != null) {
            av.adicionarQuestao(1, "Questão 1", 3.33);
            av.adicionarQuestao(2, "Questão 2", 3.33);
            av.adicionarQuestao(3, "Questão 3", 3.33);
        }

        System.out.println(POO);
    }
}
