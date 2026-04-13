package ex001;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private double temperatura;

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
        System.out.println("Ligando termostato...");
        this.temperatura = 16;
    }

    @Override
    public void desligar(){
        System.out.println("Desligando termostato...");
        this.temperatura = 0;
    }
}
