package ex003;

public class Placar {
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante;
    public int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.pontosCasa = 0;

        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosVisitante = 0;

        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo){
        if(time.equals("casa")){
            this.pontosCasa += tipo;
        } else if(time.equals("visitante")){
            this.pontosVisitante += tipo;
        }
    }

    public void proximoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto++;
            System.out.println("Período: " + this.periodoQuarto);
        } else{
            System.out.println("Jogo encerrado!");
        }
    }

    public String toString(){
        return this.nomeTimeCasa + " " + this.pontosCasa + " x " + this.pontosVisitante + " " + this.nomeTimeVisitante + "\nPeríodo: " + periodoQuarto;
    }
}
