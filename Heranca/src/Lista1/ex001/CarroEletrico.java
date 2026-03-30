package Lista1.ex001;

public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico() {
        super();
    }

    public CarroEletrico(String marca, String modelo, double velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return this.autonomiaBateria;
    }

    @Override
    public String toString() {
        return "CarroEletrico {" +
                super.toString() +
                ", autonomiaBateria: " + this.autonomiaBateria + " km" +
                " }";
    }

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente...");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida...");
    }
}
