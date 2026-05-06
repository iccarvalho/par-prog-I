package Revisao.ex008;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime horario;
    private Filme filme;
    private ArrayList<Ingresso> ingressos;

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(int id, int sala, LocalDateTime horario) {
        this.id = id;
        this.sala = sala;
        this.horario = horario;
        this.ingressos = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public void vincularFilme(Filme filme){
        this.filme = filme;
    }

    public void venderIngresso(int id, String assento, String tipo, double preco){
        this.ingressos.add(new Ingresso(id, assento, tipo, preco));
        System.out.println("Ingresso vendido com sucesso!");
    }

    public int getId() {
        return this.id;
    }

    public int getSala() {
        return this.sala;
    }

    public LocalDateTime getHorario() {
        return this.horario;
    }

    public Filme getFilme() {
        return this.filme;
    }

    public ArrayList<Ingresso> getIngressos() {
        return this.ingressos;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Sessao { " +
                "id: " + this.id +
                ", sala: " + this.sala +
                ", horario: " + this.horario.format(formatoBR) +
                ", filme: " + this.filme +
                ", ingressos: " + this.ingressos +
                " }";
    }
}
