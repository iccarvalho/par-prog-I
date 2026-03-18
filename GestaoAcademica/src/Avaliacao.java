import java.util.ArrayList;

public class Avaliacao {
    private int ID;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(){ this.questoes = new ArrayList<>(); }

    public Avaliacao(int ID, String nome){
        this.ID = ID;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return this.ID;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Questao> getQuestoes() {
        return this.questoes;
    }

    @Override
    public String toString(){
        return "\n        {" +
                "\n           ID: " + this.ID + "," +
                "\n           Nome: " + this.nome + "," +
                "\n           Questões: " + this.questoes +
                "\n       }" +
                "\n     ";
    }

    public void adicionarQuestao(int num, String texto, double peso){
        Questao questao = new Questao(num, texto, peso);
        this.questoes.add(questao);
        System.out.println("Questão adicionada com sucesso!");
    }
}
