public class Aluno {
    private String nome, curso;
    private int ID, RA;

    public Aluno() {}

    public Aluno(int ID, String nome, int RA, String curso){
        this.ID = ID;
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public int getID() {
        return this.ID;
    }

    public int getRA() {
        return this.RA;
    }

    @Override
    public String toString() {
        return "\n        {" +
                "\n           Nome: " + this.nome + "," +
                "\n           Curso: " + this.curso + "," +
                "\n           ID: " + this.ID + "," +
                "\n           RA: " + this.RA +
                "\n        }" +
                "\n      ";
    }
}
