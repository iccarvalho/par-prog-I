package Lista1.ex003;

public class WhatsApp extends CanalNotificacao {
    private String statusLeitura;

    public WhatsApp() {
        super();
    }

    public WhatsApp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    public String getStatusLeitura() {
        return this.statusLeitura;
    }

    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinatario + "... Mensagem: " + this.mensagem);
    }

    @Override
    public String toString() {
        return "WhatsApp { " +
                "statusLeitura: " + this.statusLeitura +
                ", destinatario: " + this.destinatario +
                ", mensagem: " + this.mensagem +
                " }";
    }
}
