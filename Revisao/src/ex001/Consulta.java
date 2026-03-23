package ex001;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private double valorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {}

    public Consulta(LocalDateTime data, double valorConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorConsulta = valorConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public double getValorConsulta() {
        return this.valorConsulta;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return "Consulta{ " +
                "data: " + this.data.format(formatoBR) +
                ", valorConsulta: R$" + this.valorConsulta +
                ", medico: " + this.medico +
                ", paciente: " + this.paciente +
                " }";
    }
}
