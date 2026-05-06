package Heranca.Lista1.ex003;

import java.util.ArrayList;

public class GerenciadorNotificacoes {
    static void main(String[] args) {
        ArrayList<CanalNotificacao> mensagens = new ArrayList<>();

        mensagens.add(new Email("Prova", "Daniel F. Pires", "Quando será a prova de POO?"));
        mensagens.add(new SMS("Daniel F. Pires", "Quando vamos estudar Spring Boot?", 123456789));
        mensagens.add(new WhatsApp("Daniel F. Pires", "Poderia me recomendar para alguma vaga?", "Entregue"));

        for (CanalNotificacao mensagem : mensagens) {
            mensagem.enviar();
        }
    }
}
