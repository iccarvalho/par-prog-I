package Heranca.Lista1.ex003;

public class SMS extends CanalNotificacao {
    private int numeroTelefone;

    public SMS() {
        super();
    }

    public SMS(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroTelefone() {
        return this.numeroTelefone;
    }

    public void enviar() {
        System.out.println("Enviando SMS para o número " + this.numeroTelefone + ": " + this.mensagem);
    }

    @Override
    public String toString() {
        return "SMS { " +
                "numeroTelefone: " + this.numeroTelefone +
                ", destinatario: " + this.destinatario +
                ", mensagem: " + this.mensagem +
                " }";
    }
}
