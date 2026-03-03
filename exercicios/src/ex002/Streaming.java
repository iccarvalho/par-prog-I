package ex002;

public class Streaming {
    public String usuario;
    public String plano;
    public double mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;

        switch(plano){
            case "Básico" -> this.mensalidade = 25.90;
            case "Premium" -> this.mensalidade = 45.90;
            case "Família" -> this.mensalidade = 60.90;
            default -> System.out.println("Plano inválido!");
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme){
        if(ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else{
            System.out.println("Você precisa pagar a fatura para assistir!");
        }
    }

    public void cancelarAssinatura(){
        this.ativo = false;
        System.out.println("Assinatura cancelada com sucesso!");
    }

    public String toString(){
        return "\nUsuário: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nMensalidade R$" + this.mensalidade +
                "\nStatus: " + ((this.ativo) ? "Ativo" : "Suspenso") +
                "\nÚltimo filme assistido: " + this.ultimoFilmeAssistido + "\n";
    }
}
