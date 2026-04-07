package Lista1.ex003;

public abstract class CanalNotificacao {
    protected String destinatario;
    protected String mensagem;

    public CanalNotificacao() {}

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void exibirDados() {
        System.out.println("Mensagem: " + this.mensagem + "\nDestinatário: " + this.destinatario);
    }

    public abstract void enviar();
}
