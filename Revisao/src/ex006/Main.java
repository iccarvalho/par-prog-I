package ex006;

public class Main {
    public static void main(String[] args){
        Edificio edificio = new Edificio("Maresias", "Rua dos Bobos, 0");

        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(102, 1);
        edificio.construirApartamento(103, 1);
        edificio.construirApartamento(201, 2);
        edificio.construirApartamento(202, 2);

        System.out.println(edificio);
    }
}
