package ex004;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto(){
        this.programadores = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public int getId() {
        return this.id;
    }

    public String getNomeProjeto() {
        return this.nomeProjeto;
    }

    public ArrayList<Programador> getProgramadores() {
        return this.programadores;
    }

    public void addProgramador(Programador programador){
        this.programadores.add(programador);
        System.out.println(this.programadores.getLast().getNome() + " adicionado ao projeto!");
    }

    @Override
    public String toString() {
        return "Projeto { " +
                "id: " + this.id +
                ", nomeProjeto: " + this.nomeProjeto +
                ", programadores: " + this.programadores +
                " }";
    }

    public void listarProgramadores(){
        for(Programador programador : this.programadores){
            System.out.println(programador.getNome());
        }
    }
}
