package GestaoAcademica;

import java.util.ArrayList;

public class Disciplina {
    private int ID;
    private String nome, professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(){
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(int ID, String nome, String professor){
        this.ID = ID;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getID() {
        return this.ID;
    }

    public String getNome() {
        return this.nome;
    }

    public String getProfessor() {
        return this.professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return this.avaliacoes;
    }

    @Override
    public String toString(){
        return "Disciplina: {" +
                "\n   ID: " + this.ID + "," +
                "\n   Nome: " + this.nome + "," +
                "\n   Professor: " + this.professor + "," +
                "\n   Avaliações: " + this.avaliacoes + "," +
                "\n   Alunos: " + this.alunos +
                "\n}";
    }

    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno matriculado na disciplina " + this.nome + "!");
    }

    public void criarAvaliacao(int ID, String nome){
        Avaliacao avaliacao = new Avaliacao(ID, nome);
        avaliacoes.add(avaliacao);
        System.out.println("Avaliação criada com sucesso!");
    }

    public Avaliacao getAvaliacao(String nome){
        for(Avaliacao av : this.avaliacoes){
            if(nome.equalsIgnoreCase(av.getNome())){
                return av;
            }
        }
        return null;
    }
}
