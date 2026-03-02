public class TestaCarro {
    public static void main(String[] args){
        // play -> compila o código em .class através do JDK e roda o código com JVM

        Carro carro1 = new Carro("Fiat", "Uno", 0, false);
        carro1.ligar();
        carro1.acelerar(80);
        carro1.frear(60);
        carro1.desligar();

        Carro carro2 = new Carro("Ford", "Mustang", 0, false);
        carro2.ligar();
        carro2.acelerar(150);
        carro2.frear(60);
        carro2.frear(100);
        carro2.desligar();
    }
}
