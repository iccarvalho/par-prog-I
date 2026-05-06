package Associacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Voo {
    private int numeroVoo;
    private String origem, destino;
    private LocalDateTime data;

    public Voo() {}

    public Voo(int numeroVoo, String origem, String destino, LocalDateTime data) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getNumeroVoo() {
        return this.numeroVoo;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

        return "Voo { " +
                "numeroVoo: " + this.numeroVoo +
                ", origem: " + this.origem +
                ", destino: " + this.destino +
                ", data: " + this.data.format(formatoBR) +
                " }";
    }
}
