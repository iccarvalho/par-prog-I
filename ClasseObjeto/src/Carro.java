public class Carro {
    // propriedades ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public double velocidade; // float é um tipo de dado primitivo
    public boolean motor; // boolean é um tipo de dado primitivo

    // constructor
    public Carro(String marca, String modelo, double velocidade, boolean motor){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    // métodos
    public String toString(){
        // this representa o objeto que chama o método
        return  " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }

    public void ligar(){
        if(!this.motor){
            this.motor = true;
            System.out.println("Você ligou o motor!");
        }
    }

    public void desligar(){
        if(this.motor){
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Você desligou o motor!");
        }
    }

    public void acelerar(double x){
        if(this.motor && x > 0){
            this.velocidade += x;
            System.out.println("A velocidade agora é de " + this.velocidade + "km/h");
        }
    }

    public void frear(double y){
        if(this.motor && this.velocidade >= y){
            this.velocidade -= y;
            System.out.println("A velocidade agora é de " + this.velocidade + "km/h");
        }
    }
}