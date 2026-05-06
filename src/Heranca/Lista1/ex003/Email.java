package Heranca.Lista1.ex003;

public class Email extends CanalNotificacao{
    private String assunto;

    public Email() {
        super();
    }

    public Email(String assunto, String destinatario, String mensagem) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getAssunto() {
        return this.assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mail para " + this.destinatario + " com o assunto " + this.assunto + ": " + this.mensagem);
    }

    @Override
    public String toString() {
        return "Email { " +
                "assunto: " + this.assunto +
                ", destinatario: " + this.destinatario +
                ", mensagem: " + this.mensagem +
                " }";
    }
}
