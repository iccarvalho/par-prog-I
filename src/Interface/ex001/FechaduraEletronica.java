package Interface.ex001;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private String senha;
    private boolean trancado = true;

    public FechaduraEletronica(){}

    public FechaduraEletronica(String senha){
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    @Override
    public void validarAcesso(String senha){
        System.out.println("Validando senha...");
        if(this.senha.equals(senha)) {
            System.out.println("Acesso concedido!");
            this.ligar();
        } else {
            System.out.println("Senha incorreta!");
            this.desligar();
        }
    }

    @Override
    public void ligar(){
        this.trancado = false;
        System.out.println("Porta destrancada...");
    }

    @Override
    public void desligar(){
        this.trancado = true;
        System.out.println("Porta trancada...");
    }
}
