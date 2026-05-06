package Revisao.ex003;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> equipe;

    public Time(){
        this.equipe = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.equipe = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void contratarAtleta(Atleta atleta) {
        this.equipe.add(atleta);
        System.out.println(this.equipe.getLast().getNome() + " adicionado ao time!");
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTecnico() {
        return this.tecnico;
    }

    public ArrayList<Atleta> getEquipe() {
        return this.equipe;
    }

    @Override
    public String toString() {
        return "Time { " +
                "id: " + this.id +
                ", nome: " + this.nome +
                ", tecnico: " + this.tecnico +
                ", equipe: " + this.equipe +
                " }";
    }
}
