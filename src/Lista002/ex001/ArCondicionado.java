package Lista002.ex001;

public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){
        this.setMarca("Generics");
        this.modelo = "Standard";
        this.setTemperatura(24);
        this.ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperatura){
        this.setMarca(marca);
        this.modelo = modelo;
        this.setTemperatura(temperatura);
        this.ligado = false;
    }

    // Setters
    public void setMarca(String marca){
        if(marca.length() >= 3){
            this.marca = marca;
        } else{
            System.out.println("Marca inválida!");
        }
    }

    public void setTemperatura(int temperatura){
        if(temperatura >= 16 && temperatura <= 30){
            this.temperatura = temperatura;
        } else{
            System.out.println("Temperatura fora da faixa!");
        }
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

    public boolean isLigado(){
        return this.ligado;
    }

    // Métodos públicos
    @Override
    public String toString(){
        return "Ar-condicionado " + this.marca + " " + this.modelo + "\nTemperatura atual: " + this.temperatura + "\nStatus: " + ((ligado) ? "ligado" : "desligado");
    }

    public void ativarModoTurbo(){
        if(this.isLigado()) {
            if (this.verificarCompressor()) {
                setTemperatura(16);
            } else {
                System.out.println("Falha ao ativar o modo turbo!");
            }
        } else {
            System.out.println("Você precisa ligar o ar-condicionado primeiro!");
        }
    }

    public void ligar(){
        this.ligado = true;
        System.out.println("Ar-condicionado ligado!");
    }

    public void ajustarTemperatura(int novaTemp){
        if(this.isLigado()){
            setTemperatura(novaTemp);
        } else {
            System.out.println("Você precisa ligar o ar-condicionado primeiro!");
        }
    }

    // Métodos privados
    private boolean verificarCompressor(){
        int random = (int) (Math.random() * 10);

        return random > 2;
    }
}
