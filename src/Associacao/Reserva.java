package Associacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int codigo;
    private LocalDateTime data;
    private int assento;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {}

    public Reserva(int codigo, LocalDateTime data, int assento, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.assento = assento;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public int getAssento() {
        return this.assento;
    }

    public Passageiro getPassageiro() {
        return this.passageiro;
    }

    public Voo getVoo() {
        return this.voo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return "Reserva { " +
                "codigo: " + this.codigo +
                ", data: " + this.data.format(formatoBR) +
                ", assento: " + this.assento +
                ", passageiro: " + this.passageiro +
                ", voo: " + this.voo +
                " }";
    }
}
