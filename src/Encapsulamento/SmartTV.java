package Encapsulamento;

public class SmartTV {
    private String marca, modelo;
    private int volume;
    private boolean conectado;

    public SmartTV(){}

    public SmartTV(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectado = false;
    }

    // setters
    public void setVolume(int volume){
        if(volume >= 0  && volume <= 100){
            this.volume = volume;
        } else{
            System.out.println("Volume inválido!");
        }
    }

    public void setMarca(String marca){
        if(marca.length() < 30){
            this.marca = marca;
        } else{
            System.out.println("Marca inválida!");
        }
    }

    public void setModelo(String modelo){
        if(Character.isUpperCase(modelo.charAt(0))){
            this.modelo = modelo;
        } else{
            System.out.println("Modelo inválido!");
        }
    }

    public void setConectado(boolean conectado){
        this.conectado = conectado;
    }

    // getters
    public int getVolume(){
        return this.volume;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public boolean getConectado(){
        return this.conectado;
    }

    // Métodos públicos
    public void aumentarVolume(int volumeAumentado){
        setVolume(this.volume + volumeAumentado);
        System.out.println("Volume atual: " + this.volume);
    }

    public void diminuirVolume(int volumeDiminuido){
        setVolume(this.volume - volumeDiminuido);
        System.out.println("Volume atual: " + this.volume);
    }

    public void abrirYoutube(){
        if(this.checarInternet()){
            System.out.println("Abrindo YouTube!");
        } else{
            System.out.println("Não foi possível abrir o YouTube, verique sua conexão com a internet!");
        }
    }

    // Métodos privados
    private boolean checarInternet(){
        System.out.println("Buscando sinal de Wi-Fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP...");

        int random = (int) (Math.random() * 10);

        if(random < 5){
            System.out.println("Conectado a internet!");
            return true;
        } else{
            System.out.println("Problema de conexão!");
            return false;
        }
    }
}
