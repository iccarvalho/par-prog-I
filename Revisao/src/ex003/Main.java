package ex003;

public class Main {
    public static void main(String[] args){
        Atleta atleta = new Atleta(115, "Rodriguez", "Ala");

        Time time = new Time(1, "Sesi Franca Basquete", "Helinho");

        // atleta independente
        System.out.println(atleta);

        // Agregação
        time.contratarAtleta(atleta);
        System.out.println(time);
    }
}
