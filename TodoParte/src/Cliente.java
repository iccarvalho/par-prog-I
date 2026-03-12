public class Cliente {
    private int ID;
    private String nome, CPF, endereco;

    public Cliente() {}

    public Cliente(int ID, String nome, String CPF, String endereco) {
        setID(ID);
        setNome(nome);
        setCPF(CPF);
        setEndereco(endereco);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getID() {
        return this.ID;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "\n  ID: " + this.ID +
                "\n  nome: " + this.nome +
                "\n  CPF: " + this.CPF +
                "\n  endereco: " + this.endereco +
                "\n },";
    }
}
