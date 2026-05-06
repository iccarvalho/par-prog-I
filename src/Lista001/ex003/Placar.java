package Lista001.ex003;

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
        if(tipo < 1 || tipo > 3){
            System.out.println("Pontuação inválida!");
            return;
        }

        if(time.equalsIgnoreCase("casa")){
            this.pontosCasa += tipo;
        } else if(time.equalsIgnoreCase("visitante")){
            this.pontosVisitante += tipo;
        } else {
            System.out.println("Time não encontrado!");
        }
    }

    public void proximoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto++;
            System.out.println("Iniciando o " + this.periodoQuarto + "º quarto!");
        } else{
            System.out.println("Jogo encerrado!");
        }
    }

    @Override
    public String toString(){
        return this.nomeTimeCasa + " " + this.pontosCasa + " x " + this.pontosVisitante + " " + this.nomeTimeVisitante + "\nPeríodo: " + periodoQuarto;
    }
}
