package Interface.ex001;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private double temperatura;
    public boolean ativo = false;

    public TermostatoSmart(){}

    public TermostatoSmart(double temperatura){
        this.temperatura = temperatura;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    @Override
    public double lerTemperatura(){
        return this.temperatura;
    }

    @Override
    public void ligar(){
        this.ativo = true;
        System.out.println("Ligando termostato...");
        this.temperatura = 22.5;
    }

    @Override
    public void desligar(){
        this.ativo = false;
        System.out.println("Desligando termostato...");
        this.temperatura = 0;
    }
}
