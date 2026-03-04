public class SmartTV {
    private String marca, modelo;
    private int volume;

    public SmartTV(){

    }

    public SmartTV(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
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
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.marca = marca;
    }

    // getters
    public int getVolume(){
        return this.volume;
    }
}
