public class TestaCarro {
    public static void main(String[] args){
        // play -> compila o código em .class através do JDK e roda o código com JVM

        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Uno";
        obj1.velocidade = 0;
        obj1.motor = false;
        System.out.println(obj1.toString());

        Carro obj2 = new Carro();
        obj2.marca = "GM";
        obj2.modelo = "Onix";
        obj2.velocidade = 0;
        obj2.motor = false;
        System.out.println(obj2.toString());
    }
}
