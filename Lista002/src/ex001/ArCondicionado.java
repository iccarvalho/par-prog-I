package ex001;

public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){}

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado){
        setMarca(marca);
        setModelo(modelo);
        setTemperatura(temperatura);
    }

    // Setters
    public void setMarca(String marca){
        if(marca.length() >= 3){
            this.marca = marca;
        } else{
            System.out.println("Marca inválida!");
        }
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setTemperatura(int temperatura){
        if(temperatura >= 16 && temperatura <= 30){
            this.temperatura = temperatura;
        } else{
            System.out.println("Temperatura fora da faixa!");
        }
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    // Getters
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getTemperatura(){
        return this.temperatura;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    // Métodos públicos
    @Override
    public String toString(){
        return "Ar-condicionado " + this.marca + " " + this.modelo + "\nTemperatura atual: " + this.temperatura + "\nStatus: " + ((ligado) ? "ligado" : "desligado");
    }

    public void ativarModoTurbo(){
        if(verificarCompressor()){
            setTemperatura(16);
        } else{
            System.out.println("Falha ao ativar o modo turbo!");
        }
    }

    // Métodos privados
    private boolean verificarCompressor(){
        int random = (int) (Math.random() * 10);

        return random > 2;
    }
}
