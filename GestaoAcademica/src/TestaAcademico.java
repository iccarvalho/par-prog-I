public class TestaAcademico {
    public static void main(String[] args){
        Aluno al1 = new Aluno(1, "João", 12345, "Ciência da Computação");
        Aluno al2 = new Aluno(2, "Maria", 56789, "Ciência da Computação");

        Disciplina POO = new Disciplina(1, "Programação Orientada a Objetos", "Daniel F. Pires");

        POO.matricularAluno(al1);
        POO.matricularAluno(al2);

        POO.criarAvaliacao(1, "Avaliação Semestral");

        for (int i = 0; i < 3; i++) {
            POO.getAvaliacoes().getFirst().adicionarQuestao(i+1, "Questão " + (i+1), 3.33);
        }

        System.out.println(POO);
    }
}
