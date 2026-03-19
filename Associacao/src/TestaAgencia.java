import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);

        Passageiro pas1 = new Passageiro("123", "Fulano");
        Voo voo1 = new Voo(777, "Ribeirão Preto", "Brasília", data);

        Reserva res1 = new Reserva(1, LocalDateTime.now(), 101, pas1, voo1);
        System.out.println(res1);

        // exiba o destino do voo da reserva
        System.out.println(res1.getVoo().getDestino());

        // exiba o nome do passageiro da reserva
        System.out.println(res1.getPassageiro().getNome());
    }
}
