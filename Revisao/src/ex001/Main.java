package ex001;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        // Sitema de Clínica Médica

        Medico medico = new Medico("Dr. Cláudio", "Dermatologia", 1);
        Paciente paciente = new Paciente("Rafael", "123.456.789-0", 101);

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 9, 30);

        Consulta consulta = new Consulta(data, 300, medico, paciente);

        System.out.println(consulta);
    }
}
